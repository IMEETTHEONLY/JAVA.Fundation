package Steam流;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamDemo11 {
    public static void main(String[] args) {
        //终结方法----collect方法

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三四-男-15","张思-女-13","张超-男-16","张武-男-52","武大靖-女-66","武松-男-20");


        //获取所有为男性的集合

        //获取的结果为arraylist
        List<String> collect = list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "男".equals(s.split("-")[1]);

            }
        }).collect(Collectors.toList());

        System.out.println(collect);


        //改写为lambda表达式
        System.out.println("===========");
        List<String> collect1 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(collect1);
        
        
        //获取结果为set
        //细节:它会自动去重然后将元素加入set集合当中
        Set<String> collect2 = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(collect2);

        System.out.println("===========");
        //获取数据为map
        //toMap的两个参数分别是表示键的类型，值的类型
        // 获取男性的名字+年龄
        Map<String, Integer> collect3 = list.stream().
                filter(s -> "男".equals(s.split("-")[1])).

                //第一个参数是流里面的数据类型，第二个是要转换成的类型
                        collect(Collectors.toMap(new Function<String, String>() {

                    @Override
                    //返回值的String是转换成的类型就是key/value
                    //函数参数是流里面的数据
                    public String apply(String s) {

                        return s.split("-")[0];
                    }
                    //这是第二个函数参数
                }, new Function<String, Integer>() {


                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));

                System.out.println(collect3);

    }




}
