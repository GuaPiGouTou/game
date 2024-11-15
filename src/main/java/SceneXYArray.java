import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.google.gson.Gson;

public class SceneXYArray {
    public ArrayList<int[]> getSceneXY_1() {
        return SceneXY_1;
    }

    public int getMinCount() {
        return MinCount;
    }

    public void setMinCount(int minCount) {
        MinCount = minCount;
    }

    private int MinCount;

    /**
     *  环境生成左上角坐标和是否穿透属性  1.不能穿透 0.可以穿透 
     *  环境块大小 50*50 
     *  环境三维数组   x ,y ,属性,图片序号
     *  1.TileSet_02 2.
     */

    private ArrayList<int[]> SceneXY_1 = new ArrayList<>();
    public SceneXYArray(){
        initSceneXY_1();
    }

    public void initSceneXY_1(){
        /***
         *地面坐标x:0 Y：800开始
         *场景1500*1000
         */

        Gson gson = new Gson();
        try (FileReader reader = new FileReader(Data.NewMap_1.getFile())) {
            MapData map = gson.fromJson(reader, MapData.class);
            int Mapwidth = map.getLayers().get(0).getWidth();
            int Mapheight = map.getLayers().get(0).getHeight();
            int[] data = map.getLayers().get(0).getData();
            Set<Integer> penetrableSet = new HashSet<>(Arrays.asList(9,43,44,45,46,47,48,49,50,55,56,57,58,59,60));
//可穿透 无法站立
            Set<Integer> NO_Trap = new HashSet<>(Arrays.asList(51,52,53,54));//不可穿透的陷阱

            for(int i=0;i<data.length;i++){

                if(data[i]!=0)
                {

                    int[] temp = new int[5];
                    temp[0] = i % Mapwidth * 50; // X坐标
                    temp[1] = (i / Mapwidth) * 50; // Y坐标，每行增加50

                    temp[3] = data[i]-1; // 图片资源
                    temp[2] = penetrableSet.contains(data[i]) ? 0 : 1; // 如果是  设置为可穿透的，否则不可穿透
                    temp[4] = NO_Trap.contains(data[i])?-1:0;







                    SceneXY_1.add(temp);
                    if (temp[0] == 0) {
                        // 遍历 SceneXY，找到 temp 的下标
                        for (int j = 0; j < SceneXY_1.size(); j++) {
                            if (SceneXY_1.get(j)[0] == temp[0] && SceneXY_1.get(j)[1] == temp[1]) {  // 比较 temp 的完整值
                                setMinCount(j);// 获取 temp 在 SceneXY 中的下标
                                break;  // 找到后跳出循环
                            }
                        }


                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }






    }
}
