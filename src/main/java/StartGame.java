import javax.swing.*;

public class StartGame extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(1500,1000);
        GamePanel gamePanel = new GamePanel();
        jFrame.add(gamePanel);
        jFrame.setVisible(true);
    }
    
}
