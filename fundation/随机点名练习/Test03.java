package 随机点名练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//被点到的学生不会再点到了，如果说所有学生点完了需要第二轮点名
public class Test03 {
    public static void main(String[] args) {

        //只要将点名的加入新集合，然后移除该元素即可


        //定义集合
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"范闲","范键","万顷","罗怀里","柳青颜","周云福","郭小波","李玉斌","油量","陈正洋");

        //定义装载数据的临时数组
        ArrayList<String> temp=new ArrayList<>();


        //进行十轮点名
        for (int i = 0; i < 10; i++) {
            System.out.println("=====第"+i+"轮比赛开始了============================");
            //每轮点名的过程
            while (!list.isEmpty()){
                //开始点名



                //方法一：
//                Collections.shuffle(list);
//                String name=list.get(0);
//                System.out.println("此次被点到的学生是:"+name);
//                //核心代码：
//
//                //移除当前被点名的学生
//                list.remove(name);
//
//                //将当前学生加入临时数组
//                temp.add(name);
//                System.out.println(temp);
//                System.out.println(list);


                //方法二:
                Random r=new Random();
                int index = r.nextInt(list.size());  //删除学生并获得删除的对象

                String name = list.remove(index);
                //将当前学生加入新集合
                temp.add(name);
                System.out.println(name);
            }

            //此时将临时数组的所有元素复制到原数组即可
            list.addAll(temp);
            temp.clear();

            System.out.println(temp);
            System.out.println(list);
        }

    }
}
