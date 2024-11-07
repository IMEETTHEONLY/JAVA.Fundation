package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        //方法引用-引用静态方法

        //将集合的数字都变成int类型
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"1","2","3");

        //用stream流的方式
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {

                return Integer.parseInt(s);
            }
        }).forEach(s-> System.out.println(s));

        //方法引用
        /*
        * 1.方法已经存在
        * 2.参数必须是string s
        * 3.实现的从字符串转换为整数
        *
        *
        * Integer.paresint全部满足
        * */

        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));
    }
}
