package 方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo6 {
    public static void main(String[] args) {
        //数组的方法引用  数据类型[]:new  其实就引用它的构造方法

        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,5,6,4);

        //采用stream流转换为数组
//        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
//            @Override
//            public Integer[] apply(int value) {
//                return new Integer[value];
//            }
//        });


        //方法引用
        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    }
}
