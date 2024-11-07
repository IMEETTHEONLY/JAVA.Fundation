package 随机点名练习;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

//70%的概率抽到男生，30%抽到女生
public class Test02 {
    public static void main(String[] args) {

        //创建集合用来存储概率
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);

        //创建男生数组
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"范闲","范键","万顷","罗怀里","柳青颜","周云福","郭小波");

        //创建女生数组
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"李玉斌","油量","陈正洋");

        //创建随机索引表示概率
        Random r=new Random();
      int flag=  r.nextInt(list.size());

        //核心逻辑
        String name;  //抽取到的名字
        if(list.get(flag)==1){
            //此时抽取男生
            Collections.shuffle(list1);
           name=list1.get(0);
        }else {
            //此时抽取女生
            Collections.shuffle(list2);
             name=list2.get(0);
        }

        System.out.println(list.get(flag));
        System.out.println(name);
    }
}
