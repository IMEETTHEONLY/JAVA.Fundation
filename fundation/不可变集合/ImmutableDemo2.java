package 不可变集合;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
            //创建不可变set集合

            //细节:集合里面元素是不可重复的
            Set<String> s = Set.of( "张三","李四", "王五", "赵六");


            //set集合没有索引，所以说只能用迭代器和增强for
            Iterator<String> sets = s.iterator();
            //再对迭代器set数组进行遍历
            while (sets.hasNext()){
                //迭代器不能修改值,只能用迭代器自身的方法修改值
                String str= sets.next();
                System.out.println(str);
            }

            //增强for其实底层就是迭代器
//            for (String string : s) {
//                System.out.println(string);
//            }

            //报错不可修改
            //s.add("eee");
    }
}
