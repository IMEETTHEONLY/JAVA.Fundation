package 常见算法.Arrays;

import java.util.Arrays;

public class MyArraysDemo1 {
        public static void main(String[] args) {
            //将数组变成字符串  底层实际上是用stringbuilder然后去拼接字符串
            int[] arr={1,2,3,4,5,6,7,8,9,10};
            System.out.println(Arrays.toString(arr));

            //二分查找查找元素  数组元素必须升序(降序也不行)
            //索引是不存在的话，返回的是负的插入点-1
            System.out.println(Arrays.binarySearch(arr,10));
            System.out.println(Arrays.binarySearch(arr,2));
            System.out.println(Arrays.binarySearch(arr,20));   //-10-1


            //copyOf
            /*
            * newlength若小于老数组，部分拷贝。
            * 大于老数组，就会赋予默认值零(初始化)
            * 等于老数组，完全拷贝。
            *
            *
            * */
//            int[] newArr1=Arrays.copyOf(arr,10);

            //他的下标包头不包尾，包左不包右
            int[] newArr1=Arrays.copyOfRange(arr,0,9)  ;
            System.out.println(Arrays.toString(newArr1));



            //fill：填充数组
            Arrays.fill(arr,100);
            System.out.println(Arrays.toString(arr));


            //sort:排序：给数据进行默认升序排序，底层使用的是快速排序。
            int[] arr2={10,2,65,4,64,1,6};
            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr2));
        }
}
