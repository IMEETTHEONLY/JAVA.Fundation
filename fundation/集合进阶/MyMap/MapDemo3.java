package 集合进阶.MyMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

//Map遍历-键值对
public class MapDemo3 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String, String> m = new HashMap<>();

        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "暮江平");
        m.put("尹志平", "小龙女");

        //通过entrySet获取每一个entry对象
        //细节:这里的set泛型，里面装的是entry对象(键值对),所以说也要指定entry的泛型，并且源码当中的entry是map接口的内部接口，所以说要写map.的前缀
        Set<Map.Entry<String, String>> entries = m.entrySet();

        //利用增强for遍历set集合
//        for (Map.Entry<String, String> entry : entries) {
//            //此时获取的entry就是键值对，对象
//            String key=entry.getKey();
//            String value=entry.getValue();
//            System.out.println(key+"="+value);
//        }

        //利用迭代器遍历
//        Iterator<Map.Entry<String,String>> it=entries.iterator();
//        while (it.hasNext()){
//            Map.Entry<String,String> entry= it.next();
//            String key=entry.getKey();
//            String value=entry.getValue();
//            System.out.println(key+"="+value);
//        }

        //利用lambda表达式
        entries.forEach(stringStringEntry-> {
                String key=stringStringEntry.getKey();
                String value=stringStringEntry.getValue();
                System.out.println(key+"="+value);
            }
        );
    }
}
