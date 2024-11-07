package 方法引用;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Demo5 {
    public static void main(String[] args) {

        //方法引用----调用成员方法   格式:类名+成员方法
        //将所有的小写字母转换为大写字母

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"abc","adf","xfea");

        //常规方法
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));


        //通过成员方法调用实现
        //方法细节:
        /*
        *
        *       1.需要是函数接口
        *       2.被引方法存在
        *       3.如果说被引用的方法的形参，需要根抽象方法的第二个参数到最后一个参数保持一致，返回值保持一致（如果说没有第二个参数，被引方法就是无参构造）
        *       4.被引方法要完成当前的需求
        *
        *       抽象方法形参：第一个参数表示，决定可以引用哪个类当中的方法(仅仅在这个类中的方法可以被引用)，在stream流当中第一个数据一般都是流里面的
        *
        *
        *      核心总结:只能调用跟第一个参数相同类当中的方法
        *
        * */
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
