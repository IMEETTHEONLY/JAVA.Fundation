package 泛型;

import java.util.ArrayList;

public class GenericsDemo3 {

    public static void main(String[] args) {
        //利用工具类的静态泛型方法添加多个元素
        ArrayList<String> list=new ArrayList<>();
        ListUtil.addAll(list,"aaa","bbb","ccc","ddd");

        System.out.println(list);
    }
}
