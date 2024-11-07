package Steam流;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SteamDemo2 {
    public static void main(String[] args) {
        //双列集合
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"aaa");
        hm.put(2,"aa");
        hm.put(3,"aaa6");
        hm.put(4,"aaa3");

        //由于双列集合不能直接获取到steam流，所以说只能先获取entrySet和keySet
        //entrySet方式
      // Set<Map.Entry<Integer,String>> entrys=hm.entrySet();

//        Stream<Map.Entry<Integer, String>> stream = entrys.stream();
//        stream.forEach(new Consumer<Map.Entry<Integer, String>>() {
//            @Override
//            public void accept(Map.Entry<Integer, String> entry) {
//                System.out.println(entry.getKey()+"="+entry.getValue());
//            }
//        });

        //链式编程
        //entrys.stream().forEach(entry -> System.out.println(entry.getKey()+"="+entry.getValue()));

        //keySet方式  取名方式:自动生成的****s，然后lamed表达式的参数少一个s
        Set<Integer> aaa = hm.keySet();
       aaa.stream().forEach(integer -> System.out.println(integer));


    }
}
