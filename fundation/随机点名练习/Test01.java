package 随机点名练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
*
*       班级里有n个学生，实现随机点名器
* */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"范闲","范键","万顷","罗怀里","柳青颜","周云福","郭小波","李玉斌","油量","陈正洋");

        //随机点名-1
//        Random r=new Random();
//        int index=r.nextInt(list.size());
//        String name=list.get(index);
//        System.out.println(name);

        //随机点名-2
        Collections.shuffle(list);
        System.out.println(list.get(0));

    }
}
