package 集合进阶.MyMap;

import java.util.HashMap;
import java.util.Map;

//Map方法的探究
public class MapDemo1 {
    public static void main(String[] args) {

        //创建Map对象
        Map<String, String> m = new HashMap<>();

        //添加元素
        /*
        *       put方法详解
        *       1.如果说添加数据的时候键不存在，那么就将键值对添加到map当中,方法返回null，因为没有元素被覆盖掉
        *       2.若键值存在，那么会覆盖元素的键值对象覆盖然后返回被覆盖的元素对象
        *
        *
        * */

       String value1= m.put("郭靖", "黄蓉");
        m.put("韦小宝", "暮江平");
        m.put("尹志平", "小龙女");

//        String value2 = m.put("郭靖2", "小龙女");
//
//        System.out.println(value2);


        //移除map
        //将要删除的键的值进行返回
//       String reulst= m.remove("郭靖");
//        System.out.println(reulst);

        //清空map所有的值
        //m.clear();

        //判断是否包含
        //键
//       Boolean keyReuslt= m.containsKey("郭靖2");
//        System.out.println(keyReuslt);
//
//        //值
//        Boolean keyValue=m.containsValue("暮江平");
//        System.out.println(keyValue);

        //判断是否为空
        System.out.println(m.isEmpty());
        //判断map长度
        System.out.println(m.size());

        System.out.println(m);
    }
}
