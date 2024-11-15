import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.游戏面板开始完成
 * 2.人物动作：跳跃 向左 向右 完成
 * 3.环境生成 完成
 * 4.人物与环境碰撞站立 完成
 * 5.无环境 可掉落环境 人物掉落  完成
 * 6.场景移动 坐标修正 完成
 * 7.人物与不可穿透场景碰撞检测 完成
 * 8.人物属性完善
 *
 * 动作 :1. 按键监听 2.定时器启动 3.定时器方法actionPerformed中启动动画 4.动画中更新标志位动画位置帧图片 停止计时器
 */
public class GamePanel extends JPanel implements KeyListener, ActionListener,MouseListener {
    /**
     * 是否进行环境移动
     * 环境生成左上角坐标和是否穿透属性  1.不能穿透 0.可以穿透
     * 按键标识符组
     * 暂停标志
     * 地图坐标信息集
     * 环境移动速度
     * 游戏界面标志
     */

    private  boolean isScenMove=false;
    private ArrayList<int []> SceneXY;
    private boolean GameFlag = false;
    private boolean[] keys = new boolean[256];
    private boolean isPaused = false;
    private SceneXYArray sceneXYArray;
    private int Steep =5;
    private int S =5;
    private boolean isInterface = true;
    private String text="默认文本";
    private Map<Integer, Image> grassImagesCache = new HashMap<>();
    /**
     * 人物坐标
     * 人物方向
     * 人物速度
     * 人物帧
     * 是否站立地面
     * 移动定时器
     * 人物血量
     * 人物伤害标识符
     * 人物伤害动画步进量
     */
    private int role_x = 700;
    private int role_y = 800;
    private String role_Dire = "R";
    private int moveSpeed = 0;
    private int moveFrame = 0;
    private  boolean isOnGround;
    private Timer MoveTimer = new Timer(10,this);
    private int BloodVolume =0;
    private Boolean IsRole_Hurt=false;
    private int HurtFrame=0;
    private int HurtSteep=200;
    private boolean IsMove=false;
    /**
     * 跳跃步进量
     * 是否在跳跃
     * 跳跃帧
     * 跳跃定时器
     */
    private int jumpStep = 150;
    private boolean isJumping = false;
    private int JumpFrame = 10;
    /**
     * 滑铲帧
     * 滑铲定时器
     * 是否在滑铲
     * 滑铲步进量
     */
    private int SlidingFrame = 0;

    private  boolean IsSliding=false;
    private int SlidingSteep =100;
    /**
     x,y,attribute:0 无属性
     */
    public GamePanel() {

        init();
        initScene();
        MoveTimer.start();
        setFocusable(true);
        addKeyListener(this);
        addMouseListener(this);
    }
    /**
     * 初始化坐标
     */
    private void init() {
        role_x = 700;
        role_y = 715;
        BloodVolume = 5;
    }
    // 重启游戏的方法
    private void RestartGame() {
        init(); // 重新初始化角色属性
        initScene(); // 重新初始化场景
        GameFlag = false; // 重新开始游戏状态
        repaint(); // 重绘面板
    }
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;

        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                role_Dire = "R";
                IsMove = true;
                break;
            case KeyEvent.VK_LEFT:
                role_Dire = "L";
                IsMove = true;
                break;
            case KeyEvent.VK_UP:
                if (!isJumping && isOnGround&&!IsRole_Hurt) {
                    startJump();
                }
                break;
            case KeyEvent.VK_DOWN:
                if (!IsSliding && !isJumping && isOnGround&&!IsRole_Hurt) {
                    StartSliding();
                }
                break;
            case KeyEvent.VK_ESCAPE:
                isPaused = !isPaused;
                break;
            case KeyEvent.VK_R:
               RestartGame();
                break;
        }
    }

    /***
     * 滑铲动作启动
     */
    private void StartSliding() {
        IsSliding = true;
    }
    /**
     * 跳跃动作启动
     */
    private void startJump() {
        isJumping = true;
    }
    /**
     * 弹起按键设置为false
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                IsMove = false;
                break;
            case KeyEvent.VK_LEFT:
                IsMove = false;
                break;
        }
    }
    /**
     * 更新人物左右行走坐标方法
     */
    private void updateAnimation() {


        // 控制移动逻辑，避免重复处理相同的动作
        if (IsMove) {
            // 根据按键方向设置角色方向
            role_Dire = keys[KeyEvent.VK_RIGHT] ? "R" : "L";
            if (PeripheralCollisions()) {
                role_x += keys[KeyEvent.VK_RIGHT] ? moveSpeed : -moveSpeed;
            }
            moveFrame = (moveFrame + 1) % (role_Dire.equals("R")
                    ? Data.Golem_Walking_R_Img.length
                    : Data.Golem_Walking_L_Img.length);
            updateScene();  // 移动场景
        } else {
            moveFrame = 0; // 停止时重置帧
        }
        checkCollisions();

    }

    /**
     * 定时器方法 判断是否跳跃动画
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(IsMove){
            updateAnimation();
        }
        if (isJumping) {
            handleJump();
        }
        if(IsSliding){
            Sliding();
        }
        if(IsRole_Hurt){
            Hurt();
        }
        repaint();
    }

    /**
     * 人物受伤动画
     */
    private void Hurt() {
        if (IsRole_Hurt) {
            //动画帧
           HurtFrame = (HurtFrame + 1) % Data.Golem_IdleBlinking_R_Img.length;
            HurtSteep -= 5;
        }
        if (HurtSteep <= 0) {
            HurtSteep = 200;
            IsRole_Hurt = false; //受伤动画播放完毕

        }
    }
    private Boolean Hurt_num(int Blood,int Hurt,int i){
        if(Blood+Hurt<=0){
         return false;
        }else {
            BloodVolume += Hurt;
            SceneXY.remove(i);
            return true;
        }
    }
    /***
     * 滑铲动画帧更新 坐标更新
     */
    private void Sliding() {
        if (IsSliding) {
            // 处理滑铲方向
            if (role_Dire.equals("R")) {
                if (PeripheralCollisions()) {
                    updateScene();
                }
            } else {
                if (PeripheralCollisions()) {
                    updateScene();
                }
            }
            SlidingFrame = (SlidingFrame + 1) % Data.Golem_Sliding_R_Img.length;
            SlidingSteep -= 10;
        }
        if (SlidingSteep <= 0) {
            SlidingSteep = 100;
            IsSliding = false; // 滑铲动画播放完毕
//            SlidingTimer.stop();
            // 确保角色位置不发生突变
            if (role_Dire.equals("R")) {
                role_x += 10; // 根据需要调整角色的最终位置
            } else {
                role_x -= 10; // 根据需要调整角色的最终位置
            }
        }
    }
    /***
     * 跳跃坐标逻辑
     * jumpStep 跳跃距离  为0时人物到达最高点
     * groundLevel 地面距离  人物高度大于地面时 运行下降动画
     */
    private void handleJump() {



        if(JumpCollisions()){
            if (jumpStep > 0) {
                role_y -= 5; // 向上跳跃
                jumpStep -= 5;
            } else {
                role_y += 6; // 向下掉落
            }
        }else{
            jumpStep = 0;
            if(role_y<715) {
                role_y += 6; // 向下掉落
            }
        }
        // 如果跳跃高度为0且没有在地面上，结束跳跃
        if (jumpStep <= 0 && isOnGround) {
            isJumping = false;
            jumpStep = 150; // 重置跳跃高度

        }
        checkCollisions();

    }
    /**
     * 场景绘制
     */
    public void initScene( ){
        sceneXYArray = new SceneXYArray();
        SceneXY =  sceneXYArray.getSceneXY_1();
    }
    /***
     * 场景移动
     */
    public void updateScene() {

        if(!PeripheralCollisions())return;
        if(IsRole_Hurt)return;
        if (role_Dire.equals("R") && !isScenMove) {
            isScenMove = true;
            // 更新场景的实际坐标
            if(SceneXY.get(SceneXY.size()-1)[0]-Steep<1500||!(role_x<800&&role_x>700)){
                isScenMove = false;
                role_x +=3;
            }else{
                for (int i = 0; i < SceneXY.size(); i++) {
                    SceneXY.get(i)[0] -= Steep; // 根据需要调整移动的速度
                }
            }
        } else if (role_Dire.equals("L") && !isScenMove) {
            isScenMove = true;
            // 更新场景的实际坐标
            if(SceneXY.get(sceneXYArray.getMinCount())[0]+Steep>0||!(role_x<800&&role_x>700)){
                    isScenMove = false;
                role_x -=3;
            }else {
                for (int i = 0; i < SceneXY.size(); i++) {
                    SceneXY.get(i)[0] += Steep; // 根据需要调整移动的速度
                }
            }
        } else {

            isScenMove = false;
        }
    }
    /**
     * 左右移动碰撞检测 人物矩形 role_x + 15+py, role_y + 40, 50, 45
     * @return
     */
    private boolean PeripheralCollisions() {
        for (int i = 0; i < SceneXY.size(); i++) {
            if (SceneXY.get(i)[2] == 1) { // 无法穿透
                // 检查角色场景的碰撞
                int sceneX = SceneXY.get(i)[0];
                int sceneY = SceneXY.get(i)[1];
                int py=0;
                if(role_Dire.equals("R")) {
                    py=5;
                }else{
                    py=-5;
                }
                if(role_x>1490||role_x<0){
                    return false;
                }
                if (sceneY <= role_y+40 ) {
                    if (isColliding(role_x + 15+py, role_y + 40, 50, 45, sceneX, sceneY, 50, 50)) {
                        if(SceneXY.get(i)[4]==-1)
                        {
                            IsRole_Hurt = true;
                            if(!Hurt_num(BloodVolume,SceneXY.get(i)[4],i)){
                                GameFlag=true;
                            }
                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }
    /**
     *跳跃顶部检测
     */
    public boolean JumpCollisions(){
        for (int i = 0; i < SceneXY.size(); i++) {
            if (SceneXY.get(i)[2] == 1) { // 只检查可以站立的场景 无法穿透
                // 检查角色场景的碰撞
                if(SceneXY.get(i)[1]<role_y+40){
                    if(isColliding(role_x+15,role_y+40,50,45,SceneXY.get(i)[0],SceneXY.get(i)[1],50,50)){
                        if(SceneXY.get(i)[4]==-1)
                        {
                            IsRole_Hurt = true;
                            if(!Hurt_num(BloodVolume,SceneXY.get(i)[4],i)){
                                GameFlag=true;
                            }

                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }
    /**
     * 站立检测
     */
    private void checkCollisions() {

        isOnGround = false; // 初始状态设为不在地面
        // 检查与场景的碰撞
        for (int i = 0; i < SceneXY.size(); i++) {
            if (SceneXY.get(i)[2] == 1) { // 只检查可以站立的场景 无法穿透
                // 检查角色场景底部的碰撞
                if(SceneXY.get(i)[1]>role_y+45){
                    if(isColliding(role_x+40,role_y+40,30,45,SceneXY.get(i)[0],SceneXY.get(i)[1],50,50)){
                        if(SceneXY.get(i)[4]==-1)
                        {
                            IsRole_Hurt = true;
                            if(!Hurt_num(BloodVolume,SceneXY.get(i)[4],i)){
                                GameFlag=true;
                            }


                        }
                        isOnGround = true;
                    }
                }
            }
        }
        // 如果没有站在任何地面上，则掉落
        if (!isOnGround) {
            if (!isJumping) {
                role_y += 5; // 调整掉落速度
                if(role_y>1000){
                    GameFlag = true;
                }
            }
        }

    }
    /**
     * 矩形碰撞检测
     * x1: 第一个矩形的左上角 x 坐标
     *
     * y1: 第一个矩形的左上角 y 坐标。
     *
     * width1: 第一个矩形的宽度。
     *
     * height1: 第一个矩形的高度。
     *
     * x2: 第二个矩形的左上角 x 坐标。
     *
     * y2: 第二个矩形的左上角 y 坐标。
     *
     * width2: 第二个矩形的宽度。
     *
     * height2: 第二个矩形的高度。
     */
    public static boolean isColliding(int x1, int y1, int width1, int height1,
                                      int x2, int y2, int width2, int height2) {
        // 检查是否有重叠
        return !(x1 + width1 <= x2 ||  // rect1 在 rect2 左边
                x1 >= x2 + width2 ||  // rect1 在 rect2 右边
                y1 + height1 <= y2 || // rect1 在 rect2 上面
                y1 >= y2 + height2);   // rect1 在 rect2 下面
    }
    /**
     * 坐标是否在矩形内
     * @param px
     * @param py
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public boolean isPointInRectangle(int px, int py, int x1, int y1, int x2, int y2) {
        // x1, y1 是左下角，x2, y2 是右上角
        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);
        // 判断点是否在矩形内
        return (px >= minX && px <= maxX && py >= minY && py <= maxY);
    }
    /**
     * 主面板 绘制背景
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Data.backgroundImg.getImage(), 0, 0, 1500, 1000, this);
        drawStartScreen(g);

    }
    /**
     * 面板绘制 界面方法
     * @param g
     */
    private void drawStartScreen(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawImage(Data.backgroundImg.getImage(), 0, 0, 1500, 1000, this);
        g.setFont(new Font("Serif", Font.BOLD, 50));
        text = "默认文本";
        if(GameFlag){
            text = "按R重新开始";
            isInterface = false;
            isPaused = false;
            g.drawString(text,650,650);
            return;
        }else if(isInterface){
            text = "开始游戏";
            g.drawImage(Data.Interface_billboard_img.getImage(),550,500,400,400,this);
        }else if(isPaused){
            text = "暂停游戏";

        }
        else {
            drawGameScene(g);
            return;
        }
        g.drawString(text,650,650);

    }

    private Image getGrassImage(int index) {
        if (!grassImagesCache.containsKey(index)) {
            grassImagesCache.put(index, Data.getTitleSet_Grass_Img(index));
        }
        return grassImagesCache.get(index);
    }
    private Image getRoleImage(String direction, String state) {
        switch (state) {
            case "HURT":
                return direction.equals("R") ? Data.Golem_IdleBlinking_R_Img[HurtFrame].getImage()
                        : Data.Golem_IdleBlinking_L_Img[HurtFrame].getImage();
            case "JUMP":
                return direction.equals("R") ? Data.Golem_Jump_R_Img[JumpFrame].getImage()
                        : Data.Golem_Jump_L_Img[JumpFrame].getImage();
            case "SLIDE":
                return direction.equals("R") ? Data.Golem_Sliding_R_Img[SlidingFrame].getImage()
                        : Data.Golem_Sliding_L_Img[SlidingFrame].getImage();
            case "WALK":
            default:
                return direction.equals("R") ? Data.Golem_Walking_R_Img[moveFrame].getImage()
                        : Data.Golem_Walking_L_Img[moveFrame].getImage();
        }
    }
    /**
     * 面板绘制  角色方法
     * @param g
     */
    private void drawGameScene(Graphics g) {
        if (isPaused) return;
        if (GameFlag) return;
        // 绘制场景

        for (int i = 0; i < SceneXY.size(); i++) {
            if(SceneXY.get(i)[0]>1500)continue;
            Image image = getGrassImage(SceneXY.get(i)[3]);
            g.drawImage(image, SceneXY.get(i)[0], SceneXY.get(i)[1], 50, 50, this);
        }
        // 绘制角色
        String roleState = isJumping ? "JUMP" : (IsSliding ? "SLIDE" : (IsRole_Hurt ? "HURT" : "WALK"));
        Image roleImage = getRoleImage(role_Dire, roleState);
        g.drawImage(roleImage, role_x, role_y, 100, 100, this);
        // 绘制血条
        for (int i = 0; i < BloodVolume; i++) {
            g.drawImage(Data.Golem_State_blood_url_Img.getImage(), 10 + i * 30, 20, 20, 20, this);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();


        if(x>650&&x<850&&y>614&&y<652&&isInterface&&!isPaused){
            isInterface=false;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}