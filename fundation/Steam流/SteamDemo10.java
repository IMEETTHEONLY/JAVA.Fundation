package Steam流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class SteamDemo10 {
    public static void main(String[] args) {
        //stream流的终结方法-foreach

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三四-15","张思-13","张超-16","张武-52","武大靖-66","武松-20");

        //在调用终结方法的时候，可以看见它的返回值为非流(stream)
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("=============");

        //count用来计数   返回值是long
        long count = list.stream().count();
        System.out.println(count);


        //toArray是将流当中的数据转换为数组返回

        //空参回返object
        Object[] array = list.stream().toArray();
        System.out.println(Arrays.toString(array));

        System.out.println("=================");

        //指定返回的数组类型，有参构造
        //接口的泛型就是要转换的类型
        //函数参数就是返回数组的长度

        //细节:toArray会拿着你创建好的数组，然后将流当中的数据一个一个的放入
        String[] array1 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        System.out.println(Arrays.toString(array1));
        System.out.println("============");

        //改写为lamada表达式
        //value是数组的长度,该方法实现返回一个数组
        String[] array2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array2));
    }
}
