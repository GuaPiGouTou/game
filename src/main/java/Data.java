import java.awt.*;
import java.net.URL;
import javax.swing.*;
public class Data {
    //地图文件
    public static URL NewMap_1 = Data.class.getResource("/static/map/T1.tmj");
    //界面背景
    public static URL Interface_bg_Url= Data.class.getResource("/static/Interface/water-surface.png");
    public static ImageIcon Interface_bg_img = new ImageIcon(Interface_bg_Url);
    public static URL Interface_billboard_Url= Data.class.getResource("/static/Interface/signboard.png");
    public static ImageIcon Interface_billboard_img = new ImageIcon(Interface_billboard_Url);
    //游戏背景
    public static URL backgroundUtl = Data.class.getResource("/static/background.png");
    public static ImageIcon backgroundImg = new ImageIcon(backgroundUtl);
    //人物状态 血量
    public static URL Golem_State_blood_url = Data.class.getResource("/static/role_def/State/blood volume.png");
    public static ImageIcon Golem_State_blood_url_Img = new ImageIcon(Golem_State_blood_url);

    //人物默认 方向
    public static URL Golem_R_url = Data.class.getResource("/static/role_def/Golem_R_1.png");
    public static ImageIcon Golem_R_Img = new ImageIcon(Golem_R_url);
    public static URL Golem_L_url = Data.class.getResource("/static/role_def/Golem_L_1.png");
    public static ImageIcon Golem_L_Img = new ImageIcon(Golem_L_url);
    //人物受伤 右
    public static URL Golem_IdleBlinking_R_Url[] = new URL[]{
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_000.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_001.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_002.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_003.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_004.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_005.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_006.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_007.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_008.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_009.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_010.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_011.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_012.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_013.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_014.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_015.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_016.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_017.png"),

    };
    public static ImageIcon Golem_IdleBlinking_R_Img[] = {
            new ImageIcon(Golem_IdleBlinking_R_Url[0]),
            new ImageIcon(Golem_IdleBlinking_R_Url[1]),
            new ImageIcon(Golem_IdleBlinking_R_Url[2]),
            new ImageIcon(Golem_IdleBlinking_R_Url[3]),
            new ImageIcon(Golem_IdleBlinking_R_Url[4]),
            new ImageIcon(Golem_IdleBlinking_R_Url[5]),
            new ImageIcon(Golem_IdleBlinking_R_Url[6]),
            new ImageIcon(Golem_IdleBlinking_R_Url[7]),
            new ImageIcon(Golem_IdleBlinking_R_Url[8]),
            new ImageIcon(Golem_IdleBlinking_R_Url[9]),
            new ImageIcon(Golem_IdleBlinking_R_Url[10]),
            new ImageIcon(Golem_IdleBlinking_R_Url[11]),
            new ImageIcon(Golem_IdleBlinking_R_Url[12]),
            new ImageIcon(Golem_IdleBlinking_R_Url[13]),
            new ImageIcon(Golem_IdleBlinking_R_Url[14]),
            new ImageIcon(Golem_IdleBlinking_R_Url[15]),
            new ImageIcon(Golem_IdleBlinking_R_Url[16]),

    };
    //人物受伤 左
    public static URL Golem_IdleBlinking_L_Url[] = new URL[]{
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_000.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_001.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_002.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_003.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_004.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_005.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_006.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_007.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_008.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_009.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_010.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_011.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_012.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_013.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_014.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_015.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_016.png"),
            Data.class.getResource("/static/role_def/IdleBlinking_R/0_Golem_Idle Blinking_017.png"),

    };
    public static ImageIcon Golem_IdleBlinking_L_Img[] = {
            new ImageIcon(Golem_IdleBlinking_L_Url[0]),
            new ImageIcon(Golem_IdleBlinking_L_Url[1]),
            new ImageIcon(Golem_IdleBlinking_L_Url[2]),
            new ImageIcon(Golem_IdleBlinking_L_Url[3]),
            new ImageIcon(Golem_IdleBlinking_L_Url[4]),
            new ImageIcon(Golem_IdleBlinking_L_Url[5]),
            new ImageIcon(Golem_IdleBlinking_L_Url[6]),
            new ImageIcon(Golem_IdleBlinking_L_Url[7]),
            new ImageIcon(Golem_IdleBlinking_L_Url[8]),
            new ImageIcon(Golem_IdleBlinking_L_Url[9]),
            new ImageIcon(Golem_IdleBlinking_L_Url[10]),
            new ImageIcon(Golem_IdleBlinking_L_Url[11]),
            new ImageIcon(Golem_IdleBlinking_L_Url[12]),
            new ImageIcon(Golem_IdleBlinking_L_Url[13]),
            new ImageIcon(Golem_IdleBlinking_L_Url[14]),
            new ImageIcon(Golem_IdleBlinking_L_Url[15]),
            new ImageIcon(Golem_IdleBlinking_L_Url[16]),

    };//人物步行 右
    public static URL Golem_WalKing_R_Url[] = new URL[]{
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_000.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_001.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_002.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_003.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_004.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_005.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_006.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_007.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_008.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_009.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_010.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_011.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_012.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_013.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_014.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_015.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_016.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_017.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_018.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_019.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_020.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_021.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_022.png"),
            Data.class.getResource("/static/role_def/Walking/0_Golem_Walking_023.png")

    };
    public static ImageIcon Golem_Walking_R_Img[] = {
            new ImageIcon(Golem_WalKing_R_Url[0]),
            new ImageIcon(Golem_WalKing_R_Url[1]),
            new ImageIcon(Golem_WalKing_R_Url[2]),
            new ImageIcon(Golem_WalKing_R_Url[3]),
            new ImageIcon(Golem_WalKing_R_Url[4]),
            new ImageIcon(Golem_WalKing_R_Url[5]),
            new ImageIcon(Golem_WalKing_R_Url[6]),
            new ImageIcon(Golem_WalKing_R_Url[7]),
            new ImageIcon(Golem_WalKing_R_Url[8]),
            new ImageIcon(Golem_WalKing_R_Url[9]),
            new ImageIcon(Golem_WalKing_R_Url[10]),
            new ImageIcon(Golem_WalKing_R_Url[11]),
            new ImageIcon(Golem_WalKing_R_Url[12]),
            new ImageIcon(Golem_WalKing_R_Url[13]),
            new ImageIcon(Golem_WalKing_R_Url[14]),
            new ImageIcon(Golem_WalKing_R_Url[15]),
            new ImageIcon(Golem_WalKing_R_Url[16]),
            new ImageIcon(Golem_WalKing_R_Url[17]),
            new ImageIcon(Golem_WalKing_R_Url[18]),
            new ImageIcon(Golem_WalKing_R_Url[19]),
            new ImageIcon(Golem_WalKing_R_Url[20]),
            new ImageIcon(Golem_WalKing_R_Url[21]),
            new ImageIcon(Golem_WalKing_R_Url[22]),
            new ImageIcon(Golem_WalKing_R_Url[23])
    };
    //人物滑铲 右
    public static URL Golem_Sliding_R_Url[] = new URL[]{
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_000.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_001.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_002.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_003.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_004.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_005.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_006.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_007.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_008.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_009.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_010.png"),
            Data.class.getResource("/static/role_def/Sliding_R/0_Golem_Sliding_011.png"),


    };
    public static ImageIcon Golem_Sliding_R_Img[] = {
            new ImageIcon(Golem_Sliding_R_Url[0]),
            new ImageIcon(Golem_Sliding_R_Url[1]),
            new ImageIcon(Golem_Sliding_R_Url[2]),
            new ImageIcon(Golem_Sliding_R_Url[3]),
            new ImageIcon(Golem_Sliding_R_Url[4]),
            new ImageIcon(Golem_Sliding_R_Url[5]),
            new ImageIcon(Golem_Sliding_R_Url[6]),
            new ImageIcon(Golem_Sliding_R_Url[7]),
            new ImageIcon(Golem_Sliding_R_Url[8]),
            new ImageIcon(Golem_Sliding_R_Url[9]),
            new ImageIcon(Golem_Sliding_R_Url[10]),
            new ImageIcon(Golem_Sliding_R_Url[11]),

    }; //人物滑铲 左
    public static URL Golem_Sliding_L_Url[] = new URL[]{
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_000.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_001.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_002.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_003.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_004.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_005.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_006.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_007.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_008.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_009.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_010.png"),
            Data.class.getResource("/static/role_def/Sliding_L/0_Golem_Sliding_011.png"),


    };
    public static ImageIcon Golem_Sliding_L_Img[] = {
            new ImageIcon(Golem_Sliding_L_Url[0]),
            new ImageIcon(Golem_Sliding_L_Url[1]),
            new ImageIcon(Golem_Sliding_L_Url[2]),
            new ImageIcon(Golem_Sliding_L_Url[3]),
            new ImageIcon(Golem_Sliding_L_Url[4]),
            new ImageIcon(Golem_Sliding_L_Url[5]),
            new ImageIcon(Golem_Sliding_L_Url[6]),
            new ImageIcon(Golem_Sliding_L_Url[7]),
            new ImageIcon(Golem_Sliding_L_Url[8]),
            new ImageIcon(Golem_Sliding_L_Url[9]),
            new ImageIcon(Golem_Sliding_L_Url[10]),
            new ImageIcon(Golem_Sliding_L_Url[11]),

    };
    //人物步行 左
    public static URL Golem_WalKing_L_Url[] = new URL[]{
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_000.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_001.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_002.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_003.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_004.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_005.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_006.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_007.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_008.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_009.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_010.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_011.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_012.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_013.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_014.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_015.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_016.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_017.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_018.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_019.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_020.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_021.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_022.png"),
            Data.class.getResource("/static/role_def/Walking_L/0_Golem_Walking_023.png")

    };
    public static ImageIcon Golem_Walking_L_Img[] = {
            new ImageIcon(Golem_WalKing_L_Url[0]),
            new ImageIcon(Golem_WalKing_L_Url[1]),
            new ImageIcon(Golem_WalKing_L_Url[2]),
            new ImageIcon(Golem_WalKing_L_Url[3]),
            new ImageIcon(Golem_WalKing_L_Url[4]),
            new ImageIcon(Golem_WalKing_L_Url[5]),
            new ImageIcon(Golem_WalKing_L_Url[6]),
            new ImageIcon(Golem_WalKing_L_Url[7]),
            new ImageIcon(Golem_WalKing_L_Url[8]),
            new ImageIcon(Golem_WalKing_L_Url[9]),
            new ImageIcon(Golem_WalKing_L_Url[10]),
            new ImageIcon(Golem_WalKing_L_Url[11]),
            new ImageIcon(Golem_WalKing_L_Url[12]),
            new ImageIcon(Golem_WalKing_L_Url[13]),
            new ImageIcon(Golem_WalKing_L_Url[14]),
            new ImageIcon(Golem_WalKing_L_Url[15]),
            new ImageIcon(Golem_WalKing_L_Url[16]),
            new ImageIcon(Golem_WalKing_L_Url[17]),
            new ImageIcon(Golem_WalKing_L_Url[18]),
            new ImageIcon(Golem_WalKing_L_Url[19]),
            new ImageIcon(Golem_WalKing_L_Url[20]),
            new ImageIcon(Golem_WalKing_L_Url[21]),
            new ImageIcon(Golem_WalKing_L_Url[22]),
            new ImageIcon(Golem_WalKing_L_Url[23])
    };
    //人物跳跃 启动  空中 右
    public static URL Golem_Jump_R_Url[] = new URL[]{
            Data.class.getResource("/static/role_def/Golem_R_1.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Start_0.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Start_1.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Start_2.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Start_3.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Start_4.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Start_5.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Loop_0.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Loop_1.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Loop_2.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Loop_3.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Loop_4.png"),
            Data.class.getResource("/static/role_def/Jump_R/Golem_Jump Loop_5.png"),
    };

    public static ImageIcon Golem_Jump_R_Img[] = {
            new ImageIcon(Golem_Jump_R_Url[0]),
            new ImageIcon(Golem_Jump_R_Url[1]),
            new ImageIcon(Golem_Jump_R_Url[2]),
            new ImageIcon(Golem_Jump_R_Url[3]),
            new ImageIcon(Golem_Jump_R_Url[4]),
            new ImageIcon(Golem_Jump_R_Url[5]),
            new ImageIcon(Golem_Jump_R_Url[6]),
            new ImageIcon(Golem_Jump_R_Url[7]),
            new ImageIcon(Golem_Jump_R_Url[8]),
            new ImageIcon(Golem_Jump_R_Url[9]),
            new ImageIcon(Golem_Jump_R_Url[10]),
            new ImageIcon(Golem_Jump_R_Url[11]),
            new ImageIcon(Golem_Jump_R_Url[12]),
    };//人物跳跃 启动  空中 右
    public static URL Golem_Jump_L_Url[] = new URL[]{
            Data.class.getResource("/static/role_def/Golem_L_1.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Start_0.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Start_1.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Start_2.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Start_3.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Start_4.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Start_5.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Loop_0.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Loop_1.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Loop_2.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Loop_3.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Loop_4.png"),
            Data.class.getResource("/static/role_def/Jump_L/Golem_Jump Loop_5.png"),
    };

    public static ImageIcon Golem_Jump_L_Img[] = {
            new ImageIcon(Golem_Jump_L_Url[0]),
            new ImageIcon(Golem_Jump_L_Url[1]),
            new ImageIcon(Golem_Jump_L_Url[2]),
            new ImageIcon(Golem_Jump_L_Url[3]),
            new ImageIcon(Golem_Jump_L_Url[4]),
            new ImageIcon(Golem_Jump_L_Url[5]),
            new ImageIcon(Golem_Jump_L_Url[6]),
            new ImageIcon(Golem_Jump_L_Url[7]),
            new ImageIcon(Golem_Jump_L_Url[8]),
            new ImageIcon(Golem_Jump_L_Url[9]),
            new ImageIcon(Golem_Jump_L_Url[10]),
            new ImageIcon(Golem_Jump_L_Url[11]),
            new ImageIcon(Golem_Jump_L_Url[12]),
    };
    //场景
    public static URL TitleSet_Grass_Url[] = {
            Data.class.getResource("/static/Tiles/Tileset/TileSet_01.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_02.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_03.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_04.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_05.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_06.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_07.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_08.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_09.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_10.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_11.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_12.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_13.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_14.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_15.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_16.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_17.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_18.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_19.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_20.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_21.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_22.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_23.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_24.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_25.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_26.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_27.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_28.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_29.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_30.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_31.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_32.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_33.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_34.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_35.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_36.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_37.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_38.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_39.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_40.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_41.png"),
            Data.class.getResource("/static/Tiles/Tileset/TileSet_42.png"),

            Data.class.getResource("/static/Tiles/Road/1_1.png"),
            Data.class.getResource("/static/Tiles/Road/1_2.png"),
            Data.class.getResource("/static/Tiles/Road/2_1.png"),
            Data.class.getResource("/static/Tiles/Road/2_2.png"),
            Data.class.getResource("/static/Tiles/Road/3_1.png"),
            Data.class.getResource("/static/Tiles/Road/3_2.png"),
            Data.class.getResource("/static/Tiles/Road/4_1.png"),
            Data.class.getResource("/static/Tiles/Road/4_2.png"),
            Data.class.getResource("/static/Tiles/Spikes/Spikes1_1.png"),
            Data.class.getResource("/static/Tiles/Spikes/Spikes1_2.png"),
            Data.class.getResource("/static/Tiles/Spikes/Spikes2_1.png"),
            Data.class.getResource("/static/Tiles/Spikes/Spikes2_2.png"),

            Data.class.getResource("/static/Tiles/Text/尝试.png"),
            Data.class.getResource("/static/Tiles/Text/进行.png"),
            Data.class.getResource("/static/Tiles/Text/跳跃.png"),
            Data.class.getResource("/static/Tiles/Text/实现.png"),
            Data.class.getResource("/static/Tiles/Text/躲避.png"),
            Data.class.getResource("/static/Tiles/Text/障碍.png"),

    };

    public static Image getTitleSet_Grass_Img(int i) {
        return TitleSet_Grass_Img[i].getImage();
    }


    public static ImageIcon TitleSet_Grass_Img[] = {
            new ImageIcon(TitleSet_Grass_Url[0]),
            new ImageIcon(TitleSet_Grass_Url[1]),
            new ImageIcon(TitleSet_Grass_Url[2]),
            new ImageIcon(TitleSet_Grass_Url[3]),
            new ImageIcon(TitleSet_Grass_Url[4]),
            new ImageIcon(TitleSet_Grass_Url[5]),
            new ImageIcon(TitleSet_Grass_Url[6]),
            new ImageIcon(TitleSet_Grass_Url[7]),
            new ImageIcon(TitleSet_Grass_Url[8]),
            new ImageIcon(TitleSet_Grass_Url[9]),
            new ImageIcon(TitleSet_Grass_Url[10]),
            new ImageIcon(TitleSet_Grass_Url[11]),
            new ImageIcon(TitleSet_Grass_Url[12]),
            new ImageIcon(TitleSet_Grass_Url[13]),
            new ImageIcon(TitleSet_Grass_Url[14]),
            new ImageIcon(TitleSet_Grass_Url[15]),
            new ImageIcon(TitleSet_Grass_Url[16]),
            new ImageIcon(TitleSet_Grass_Url[17]),
            new ImageIcon(TitleSet_Grass_Url[18]),
            new ImageIcon(TitleSet_Grass_Url[19]),
            new ImageIcon(TitleSet_Grass_Url[20]),
            new ImageIcon(TitleSet_Grass_Url[21]),
            new ImageIcon(TitleSet_Grass_Url[22]),
            new ImageIcon(TitleSet_Grass_Url[23]),
            new ImageIcon(TitleSet_Grass_Url[24]),
            new ImageIcon(TitleSet_Grass_Url[25]),
            new ImageIcon(TitleSet_Grass_Url[26]),
            new ImageIcon(TitleSet_Grass_Url[27]),
            new ImageIcon(TitleSet_Grass_Url[28]),
            new ImageIcon(TitleSet_Grass_Url[29]),
            new ImageIcon(TitleSet_Grass_Url[30]),
            new ImageIcon(TitleSet_Grass_Url[31]),
            new ImageIcon(TitleSet_Grass_Url[32]),
            new ImageIcon(TitleSet_Grass_Url[33]),
            new ImageIcon(TitleSet_Grass_Url[34]),
            new ImageIcon(TitleSet_Grass_Url[35]),
            new ImageIcon(TitleSet_Grass_Url[36]),
            new ImageIcon(TitleSet_Grass_Url[37]),
            new ImageIcon(TitleSet_Grass_Url[38]),
            new ImageIcon(TitleSet_Grass_Url[39]),
            new ImageIcon(TitleSet_Grass_Url[40]),
            new ImageIcon(TitleSet_Grass_Url[41]),
            new ImageIcon(TitleSet_Grass_Url[42]),
            new ImageIcon(TitleSet_Grass_Url[43]),
            new ImageIcon(TitleSet_Grass_Url[44]),
            new ImageIcon(TitleSet_Grass_Url[45]),
            new ImageIcon(TitleSet_Grass_Url[46]),
            new ImageIcon(TitleSet_Grass_Url[47]),
            new ImageIcon(TitleSet_Grass_Url[48]),
            new ImageIcon(TitleSet_Grass_Url[49]),
            new ImageIcon(TitleSet_Grass_Url[50]),
            new ImageIcon(TitleSet_Grass_Url[51]),
            new ImageIcon(TitleSet_Grass_Url[52]),
            new ImageIcon(TitleSet_Grass_Url[53]),

            new ImageIcon(TitleSet_Grass_Url[54]),
            new ImageIcon(TitleSet_Grass_Url[55]),
            new ImageIcon(TitleSet_Grass_Url[56]),
            new ImageIcon(TitleSet_Grass_Url[57]),
            new ImageIcon(TitleSet_Grass_Url[58]),
            new ImageIcon(TitleSet_Grass_Url[59]),



    };
    // 场景空白
    public static URL NullTileSet_Url = Data.class.getResource("/static/Tiles/Tileset/TileSet_09.png");
    public static ImageIcon NullTileSet_Img  = new ImageIcon(NullTileSet_Url);
}
