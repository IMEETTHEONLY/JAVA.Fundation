package 集合进阶.List;

import java.util.ArrayList;
import java.util.List;

//List系列的两个删除方法
public class ListDemo2 {
    public static void main(String[] args) {

        //创建一个集合
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);


        //删除元素
        //如果说出现了方法重载的现象，他会优先调用形参和实参一致的方法
        //优先调用索引
//        list.remove(1);

        //手动装箱  这样传递过去的就是Integer的包装类是对象
        Integer i=Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);

    }
}
