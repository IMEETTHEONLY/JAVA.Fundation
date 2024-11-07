package 集合进阶.MyMap;

import java.util.Comparator;
import java.util.TreeMap;

//整数表示id，值代表商品的名称
//按商品id排序
public class TreeMapTest {
    public static void main(String[] args) {
        //要选用排序的容器那就是treeMap或者是treeSet,但是这题又有对应关系故选择map
        TreeMap<Integer,String> map=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //this-已存在，小于零存左边，大于零存右边。实现从小到达，我加一个符号就是从大到小
                return -(o1-o2);
            }
        });

        //它是根据键值排序的，键值是integer默认的comparable所以说自动从小到大排序
        map.put(4,"青椒肉丝");
        map.put(2,"火锅");
        map.put(3,"鱼香肉丝");

        System.out.println(map);
    }


}
