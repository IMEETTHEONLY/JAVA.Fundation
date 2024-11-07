package Steam流;

import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Stream;

public class SteamDemo8 {
    public static void main(String[] args) {
        //concat方法用来将两个集合合并   条件就是要这两个条件的数据类型一样，如果说不一样的话那么stream流里面装的就是他们的父类

        HashSet<String> hm1=new HashSet<>();
        Collections.addAll(hm1,"aaa","bbb","ccc","ddd");

        HashSet<String> hm2=new HashSet<>();
        Collections.addAll(hm2,"eee","fff");

        Stream.concat(hm1.stream(),hm2.stream()).forEach(s -> System.out.println(s));
    }
}
