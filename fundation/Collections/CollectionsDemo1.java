package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        //批量添加数据到集合
        ArrayList<String> list=new ArrayList<>();

        Collections.addAll(list,"abc","aaa","ccc","ddd");
        System.out.println(list);

        //打乱顺序3
        Collections.shuffle(list);
        System.out.println(list);
    }
}
