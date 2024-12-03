package myiotest3;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {
        /*
        *   Properties双列方法的使用
        * */
        //它底层实现了数据类型的绑定，所以说不需要使用泛型
        Properties properties=new Properties();

        //加入元素
        properties.put("aaa","111");
        properties.put("bbb","www");
        properties.put("ccc","hhh");
        properties.put("ddd","mmm");

        //打印集合
        System.out.println(properties);

        //遍历集合

        //得到键的集合
        Set<Object> objects = properties.keySet();
        for (Object object : objects) {
            Object key= object;
            Object value=properties.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("==========================");

        //得到entryset集合
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
