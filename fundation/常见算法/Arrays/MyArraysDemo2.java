package 常见算法.Arrays;

import java.util.Arrays;
import java.util.Comparator;

//sort的重载方法，进行降序排序
public class MyArraysDemo2 {
    public static void main(String[] args) {

        //sort(数组，规则)
        /*
        * 细节：
        * 只能给引用数据类型进行排序
        * 基本类型要变成包装类
        * */

        Integer[] arr={2,5,6,4,1,9,4,6,9,};


        //底层原理:
        //利用插入排序+二分查找的方式进行排序
        //默认把0作为有序，1-size作为无序
        //然后根据下面的compare规则进行比较，返回负数根前面的继续比较....
        Arrays.sort(arr, new Comparator<Integer>() {
            //匿名内部类的方式，new出来的是实现了new后面的接口的新类，就是override下面的没有名字的类
            @Override
            //o1是要插入的元素,o2是有序序列的最后一个元素
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
