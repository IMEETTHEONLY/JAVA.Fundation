package 集合进阶.MyMap;

import java.util.*;
import java.util.function.Consumer;

//map遍历-键找值
public class MapDemo2 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String, String> m = new HashMap<>();



        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "暮江平");
        m.put("尹志平", "小龙女");

        //通过键找值遍历:将所有的键放到单列集合当中
        Set<String> keys = m.keySet();

        //遍历单列集合，得到每一个键
//        for (String key : keys) {
//            //System.out.println(key);
//            //利用键获取值
//            String value=m.get(key);
//            System.out.println(key+"="+value);
//        }

        //迭代器方式
//        Iterator<String> it= keys.iterator();
//        while (it.hasNext()){
//            String key= it.next();
//            //根据键获取值
//            String value=m.get(key);
//            System.out.println(key+"="+value);
//        }

        //lambda表达式方式
        keys.forEach( s ->{
                //s就是每一个键，根据键获取value
                String value=m.get(s);
                System.out.println(s+"="+value);
            }
        );
    }
}
