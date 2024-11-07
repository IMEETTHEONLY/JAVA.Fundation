package Steam流;

import java.util.ArrayList;
import java.util.Collections;

public class SteamDemo6 {
    public static void main(String[] args) {
        //中间方法-limit（获取前几个元素）  skip(跳过前几个元素)

        //创建单列集合
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三四","张思","张超","张武","武大靖","武松");




        //获取前三个元素
        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("================");


        list.stream().skip(3).forEach(s -> System.out.println(s));

        System.out.println("=============");
        //这两个方法组合可以获取任意的元素   比如说获取  张武 武大靖
        list.stream().skip(3).limit(2).forEach(s -> System.out.println(s));

    }
}
