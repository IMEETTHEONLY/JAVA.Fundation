package 不可变集合;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        //创建不可变的map

        //细节
        /*
                1. map.of的底层不是可变参数 E... e(泛型),而是从1-10个键值对。
                因为键值对要用两个可变参数，这是不允许的（两个可变参数不可以出现在同一个函数参数）

                2.它与set一样键值不可重复,并且底层是hashset没有顺序，存取有序是linkedhashset
        **/

        //在这里它就已经决定好了存的位置了
        Map<Object, Object> map = Map.of("b1","成都","b2","北京1","b3","北京2","b4",
                "北京3","b5","北京4","b6","北京5","b7","b北京6","aaa","bbb");

        //遍历map
        Set<Object> keys = map.keySet();
        for (Object key : keys) {
            System.out.println(key+"="+map.get(key));
        }


        System.out.println("=============================");
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            //System.out.println(entry.getKey()+"="+entry.getValue());
            System.out.println(entry);
        }
    }
}
