package 不可变集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        //map的可变参数构造不可变集合
        //Map.ofEntrys由于可以只传递一个entrys过去所以说可以传递可变参数过去,entrys... entry

        HashMap<String,String> map=new HashMap<>();
        map.put("aaa","1");
        map.put("bbb","1");
        map.put("ccc","1");
        map.put("ddd","1");
        map.put("fff","1");
        map.put("ggg","1");
        map.put("hhh","1");
        map.put("jjj","1");
        map.put("kkk","1");
        map.put("lll","1");
        map.put("mmm","1");

        //由于可变参数的底层是数组，所以说要把数据装进数组里面

        //获取map里面的每一个entry对象
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //将集和转换为数组
        Map.Entry[] array = entries.toArray(new Map.Entry[0]);

        //将map变为不可变的集合
        Map map1 = Map.ofEntries(array);

        //打印map.
        //由于通过数组加入元素已经有了数据类型所以说，他没有用泛型

        //1通过entrySet打印
        Set set = map1.entrySet();

        for (Object entry : set) {
            System.out.println(entry);
        }

        System.out.println("===============");

        //通过keySet打印
        Set set1 = map1.keySet();
        for (Object o : set1) {
            System.out.println(o+"="+map.get(o));
        }


        //map.copyof包装了上面的方法
        Map<String, String> stringStringMap = Map.copyOf(map);
        //打印
        Set<Map.Entry<String, String>> entries1 = stringStringMap.entrySet();
        for (Map.Entry<String, String> entry : entries1) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        //报错，不可修改
        stringStringMap.put("111","4545");
    }
}
