package 集合进阶.MySet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

//遍历set
public class SetDemo1 {

    public static void main(String[] args) {
        //先创建一个set集合
        Set<String> s=new HashSet<>();


        //添加元素,重复添加，添加失败，返回false
       //boolean r1= s.add("张三");
       boolean r1= s.add("张三");
       boolean r2= s.add("李四");
       boolean r3= s.add("王五");



        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        //打印无序
        System.out.println(s);

        //迭代器遍历
        Iterator<String> it=s.iterator();
        while (it.hasNext()){
            String str= it.next();
            System.out.println(str);
        }


        //增强for遍历
        for (String str : s) {
            System.out.println(str);
        }

        //lambda表达式遍历
        s.forEach( str->System.out.println(str));
    }

}
