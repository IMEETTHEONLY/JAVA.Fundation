package Steam流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class SteamDemo9 {
    public static void main(String[] args) {
        //map转换流中的数据类型
        //创建单列集合
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三四-15","张思-13","张超-16","张武-52","武大靖-66","武松-20");

        //-**是年龄，我们要从字符串里面获取整型..

        //这里的object就是我们要转换的类型，要自己修改
                                                //这里的interger原来是object
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] split = s.split("-");
                String age=split[1];
                return Integer.parseInt(age);
            }
        }).forEach(s-> System.out.println(s));


        System.out.println("===========");

        //链式编程
        list.stream().map(s -> s.split("-")[1]).forEach(s -> System.out.println(s));

    }
}
