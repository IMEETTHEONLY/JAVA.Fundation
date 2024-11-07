package Steam流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class SteamDemo5 {
    public static void main(String[] args) {
        //中间方法:filter
        //将满足条件的元素保留下来

        //创建单列集合
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三四","张思","张超","张武","武大靖","武松");

//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                //这里返回值为true就要留下
//
//                return s.startsWith("张");
//            }
//        }).forEach(s -> System.out.println(s));

        /*
        *   对于流stream来说：
        *   1.只能使用一次，即在流中的数据只能修改一次
        *   2.不会改变原集合的值
        *
        * */


        //采用lambda表达式（这样最简洁因为stream只能使用一次）
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==2).forEach(s -> System.out.println(s));
   }


}
