package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        //引用成员方法(非静态的)

        //只要以张开头的，名字是三个字的
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三丰","张若男","张建","张强");

        //常规方法
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张")&&s.length()==3;
//            }
//        }).forEach(s -> System.out.println(s));


        //引用方法当中的引用成员方法
        //满足那四个条件


        //调用其他类成员方法    格式:new 类::方法名
        //特别注意:static方法当中没有this和super调用(主函数都是static定义的)
        list.stream().filter(new StringJudge()::stringJudge).forEach(s -> System.out.println(s));

    }
}
