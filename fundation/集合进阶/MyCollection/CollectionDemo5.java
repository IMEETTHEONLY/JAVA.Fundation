package 集合进阶.MyCollection;

import java.util.ArrayList;
import java.util.Collection;

//增强for
public class CollectionDemo5 {
    public static void main(String[] args) {

        Collection<String> coll=new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //增强for遍历
        //s表示的就是集合里面的每一个元素
//        for(String s:coll){
//            System.out.println(s);
//
//        }
        for (String s : coll) {
            System.out.println(s);
        }

    }
}
