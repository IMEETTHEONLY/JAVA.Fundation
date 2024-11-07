package 集合进阶.MySet;

import java.util.Comparator;
import java.util.TreeSet;

//comparator实现treeset
public class TreeSetDemo3 {
    public static void main(String[] args) {
        /*
        * 要求存入四个字符串 "c","ab","df","qwer"
        * 按长度排序，如果说长度一样按照首字母排序
        *
        * */
        //string已经实现了comprator所以说不能再使用comparator了
        //o1表示要添加的元素,o2表示已经在红黑树的元素
        TreeSet<String> ts=new TreeSet<>(( o1,  o2) ->{
                //按照长度排序
                int i=o1.length()-o2.length();
                //如果说长度一致按照首字母排序
                //这里妙在先判断length是否相等了之后，然后再判断是根据字母排序还是长度排序
               i= i==0?o1.compareTo(o2):i;
               return i;
            }
        );

        //添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}
