package 集合进阶.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

//List的遍历方式
public class ListDemo3 {
    public static void main(String[] args) {

        //创建一个集合
        List<String> list=new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        //迭代器
//        Iterator<String> it=list.iterator();
//        while (it.hasNext()){
//            //移动指针，获取元素
//            String str= it.next();
//            System.out.println(str);
//        }
//
//
//
//        //增强for
//        //底层是迭代器,然后s是开辟的变量，暂时存取list的值而已
//        for (String s : list) {
//            System.out.println(s);
//        }
//
//
//        //lambda
//        //底层是for循环得到每一个元素交给下面的accept
//        list.forEach( s-> System.out.println(s));

//        //普通for循环
//        //利用for循环和get的方法
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //列表迭代器
        ListIterator<String> it= list.listIterator();

        while (it.hasNext()){
            String str= it.next();
            if("bbb".equals(str)){
                //利用迭代器的方法添加
                it.add("qqq");
            }
            System.out.println(str);
        }
        System.out.println(list);
    }
}
