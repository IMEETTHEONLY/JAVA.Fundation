package 集合进阶.MyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

//学生投票统计
public class MapTest2 {
    public static void main(String[] args) {
        //首先创建集合
        HashMap<String,Integer> map=new HashMap<>();

        //初始化每个景点初始化的值
        map.put("A",0);
        map.put("B",0);
        map.put("C",0);
        map.put("D",0);


        //1-4的随机数来表示A-D,然后进行投票
        Random r=new Random();

        for (int i = 0; i < 80; i++) {
            int ticket=r.nextInt(4);
            if (ticket==1){
                //A景点的票数+1
                int scenery=map.get("A");
                scenery++;
                map.put("A",scenery);
            }
           else if (ticket==2){
                //B景点的票数+1
                int scenery=map.get("B");
                scenery++;
                map.put("B",scenery);
            }
            else if (ticket==3){
                //C景点的票数+1
                int scenery=map.get("C");
                scenery++;
                map.put("C",scenery);
            }
            else{
                //D景点的票数+1
                int scenery=map.get("D");
                scenery++;
                map.put("D",scenery);
            }
        }
        int max=0;  //记录最大票数景点
        String maxName="";  //记录最大票数景点
        //再遍历集合
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue()>max){
                max=entry.getValue();
                maxName=entry.getKey();
            }
            System.out.println("景点"+entry.getKey()+"的票数是:"+entry.getValue());
        }


        System.out.println("最大票数景点是:"+maxName+"票数为:"+max);
    }
}
