package 集合进阶.MySet;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

//利用treeSet存储整数并进行排序
public class TreeSetDemo1 {
    public static void main(String[] args) {

        TreeSet<Integer> ts=new TreeSet<>();

        //添加元素
        ts.add(5);
        ts.add(1);
        ts.add(6);
        ts.add(8);
        ts.add(9);


       // System.out.println(ts);

        //遍历集合

        //迭代器
        Iterator<Integer> it=ts.iterator();

//        while (it.hasNext()){
//            int next=it.next();
//            System.out.println(next);
//        }

        //增强for
//        for (Integer t : ts) {
//            System.out.println(t);
//        }

        //lambd表达式
        ts.forEach( integer-> System.out.println(integer));
    }
}
