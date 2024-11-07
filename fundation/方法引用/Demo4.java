package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        //将数据封装成Student类型

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌,13","万清,15","罗怀莉,15");

        //常规的使用流的方法
        list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] split = s.split(",");
                String name=split[0];
                int age=Integer.parseInt(split[1]);
                return new Student(name,age);
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("===============");

        //方法引用-构造方法引用    格式；类名:new
        //map满那四个条件（只要是个函数式接口就满足）
        //3.要满足的规则就如上面的apply方法(格式也是如此)
        List<Student> collect = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(collect);

    }
}
