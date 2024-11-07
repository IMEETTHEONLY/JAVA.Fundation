package Lambda表达式;

import java.util.Arrays;
import java.util.Comparator;

//对数组当中的字符串按照长度进行排序
public class Lambdademo2 {

    public static void main(String[] args) {
        String[] arr={"a","aaaa","aa","aaaaaa"};


        //要对数组进行按照一定的规则排序，一定是sort方法
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //根据字符串长度进行排序
//                return o1.length()-o2.length();
//
//            }
//        });

        //省略部分:小括号和打括号的内容
        //根据字符串长度进行排序
        Arrays.sort(arr, ( o1,  o2)-> o1.length()-o2.length());



        System.out.println(Arrays.toString(arr));
    }
}
