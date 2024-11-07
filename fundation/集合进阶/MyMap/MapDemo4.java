package 集合进阶.MyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//Map遍历-lambda表达式
public class MapDemo4 {

    public static void main(String[] args) {
        //创建Map对象
        Map<String, String> m = new HashMap<>();

        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "暮江平");
        m.put("尹志平", "小龙女");

        //底层实际上是用于foreach即第二种方式来实现的
        m.forEach(( key,  value)->System.out.println(key+"="+value));
    }



}
