package 集合进阶.List;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList的底层源码
public class ListDemo4 {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //迭代器遍历
        Iterator<String> it= list.iterator();;
        while (it.hasNext()){
            String str= it.next();
            System.out.println(str);

        }


    }
}
