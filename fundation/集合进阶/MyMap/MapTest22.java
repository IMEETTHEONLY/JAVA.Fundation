package 集合进阶.MyMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class MapTest22 {
    public static void main(String[] args) {
        //定义一个数组存储四个景点
        String[] arr={"A","B","C","D"};

        //创建一个数组来存储同学们的投票记录
        ArrayList<String> list=new ArrayList<>();
        //生成随机投票景点
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            //生成数组内元素的索引
            int i1 = r.nextInt(arr.length);
            //将随机的数据加入list
            list.add(arr[i1]);
        }
       // System.out.println(list);


        //很多情况位置要投票的对象个数，所以说计数器的个数不确定，此时最好的就是map来统计票数
        HashMap<String,Integer> map=new HashMap<>();

        //遍历list数组并且加入map，如果说当前元素第一次加入map即map当中不存在，那么就直接加入，否则票数+1

        for (String name : list) {
            if(map.containsKey(name)){
                //如果说存在那么久票数加+1
                int ticket=map.get(name);
                ticket++;
                //重新赋值
                map.put(name,ticket);
            }
            else{
                //不存在，直接将该景点加入即可
                map.put(name,1);
            }
        }

        int max=0;  //求最大值

        //找max的值
        Set<String> names = map.keySet();
        for (String name : names) {
            int ticket=map.get(name);
            //System.out.println(name+"="+ticket);
            //和最大票数进行比较,为什么这里不把景点名字也设置一个max呢，因为max景点可能有两个，所以说要比较票数才行
            if(ticket>max){
                max=ticket;
            }
        }


        //打印max的值
        for (String name : names) {
            int ticket=map.get(name);
            if(max==ticket){
                System.out.println(name+"="+ticket);
            }
        }

    }
}
