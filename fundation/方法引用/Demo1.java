package 方法引用;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {

        //对数组进行逆序排序
        Integer[] arr={1,2,3,4,5,6};


        //通过Arrays.sort进行排序

        //匿名内部类
        //由于泛型只能说类，所以说数组类型要使用其对应的包装类
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//
//        System.out.println(Arrays.toString(arr));


//        //lambda表达式
//        Arrays.sort(arr, ( o1,  o2)-> o2-o1);
//
//        System.out.println(Arrays.toString(arr));

        //方法引用的方式
        //有四个条件

        //对于调用处的条件
        //函数的参数必须是函数式接口
        Arrays.sort(arr,Demo1::sub);   //方法引用的格式
        System.out.println(Arrays.toString(arr));

    }

    //对于引用方法的要求
    //1.引用方法存在
    //2.参数类型和返回值一致
    //3.满足抽象方法的功能
    public static int sub(Integer i1, Integer i2){
        return i2-i1;
    }
}
