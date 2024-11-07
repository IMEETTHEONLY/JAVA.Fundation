package 不可变集合;

import java.util.List;
import java.util.function.Consumer;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        //创建不可变list集合
        //"张三","李四"，"王五"，“赵六”


        //创建完毕后就不能修改了,只能进行查询操作
        List<String> list = List.of("张三", "李四", "王五", "赵六");

        System.out.println(list.get(0));

        //lambda表达式遍历
        list.forEach( s-> System.out.println(s));


        //删除   报错
        //list.remove("李四");
        list.set(0,"aaa");
    }
}
