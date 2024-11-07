package Steam流;

import java.util.Collections;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SteamDemo1 {
    public static void main(String[] args) {
        //单列集合获取steam流
        HashSet<String> hashSet=new HashSet<>();
        Collections.addAll(hashSet,"i","am","so","tired");

//        //获取string流
//        Stream<String> stream = hashSet.stream();
//
//        //对steam进行终结操作-打印
//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                //s就set里面的每一个元素
//                System.out.println(s);
//            }
//        });

        //链式编程
        hashSet.stream().forEach(s -> System.out.println(s));
    }
}
