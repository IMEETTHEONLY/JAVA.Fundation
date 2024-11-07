package Map集合案例;
//4
import java.util.*;

//定义一个map集合，键表示省份名称，值表示city，但是市会有多个
public class Demo1 {
    public static void main(String[] args) {
        //核心就在于，map的值是单列集合

        //创建集合
        Map<String, ArrayList<String>> map=new HashMap<>();

        //初始化单列集合
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"扬州市","苏州市","无锡市","常州市");

        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"武汉市","孝感市","宜昌市","鄂州市");

        ArrayList<String> list3=new ArrayList<>();
        Collections.addAll(list3,"石家庄市","唐山市","保定市");

        //向map当中加入键值对
        map.put("南京市",list1);
        map.put("湖北市",list2);
        map.put("武汉市",list3);

        //遍历map
        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();

        //外循环获得键值对
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key=entry.getKey();

            ArrayList<String> value=entry.getValue();

            //再用StringJioner进行拼接
            //内循环获取每个市
            StringJoiner sj=new StringJoiner(",","","");
            for (String string : value) {
                sj.add(string);
            }

            System.out.println(key+"="+sj.toString()); //打印
        }
    }

}
