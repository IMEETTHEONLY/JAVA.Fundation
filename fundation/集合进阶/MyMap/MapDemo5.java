package 集合进阶.MyMap;

import java.util.LinkedHashMap;

//LinkedHashMap使用
public class MapDemo5 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();

        //加入元素   加入顺序和打印顺序一致
        lhm.put("a",123);
        lhm.put("b",415);
        lhm.put("c",325);

        System.out.println(lhm);
    }
}
