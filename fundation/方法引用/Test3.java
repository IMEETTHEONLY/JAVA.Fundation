package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {
        //把姓名和年龄拼接成   张三-23的字符串

        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("张三",21);
        Student s2=new Student("王五",61);
        Student s3=new Student("李四",21);
        Collections.addAll(list,s1,s2,s3);


        //常规方法，使用stream流
//        List<String> collect = list.stream().map(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                //拼接字符串然后返回
//                return student.getName() + "-" + student.getAge();
//            }
//        }).collect(Collectors.toList());
//
//        System.out.println(collect);



        //使用方法引用
        //类名：成员方法(一定要满足那几个规则)
        /*
        *       1.需要是函数接口
        *       2.被引方法存在    一般都是可以利用现成的
        *       3.被引方法的第二个参数开始和抽象方法一致，如果说抽象方法没有第二个参数，那么被引方法就是无参
        *       4.返回值和函数参数要和抽象方法一致
        *       5.只能调用抽象方法第一个参数类里面的方法
        * */
        List<String> collect = list.stream().map(Student::toString).collect(Collectors.toList());
        System.out.println(collect);
    }

//    public static  String transfer(Student student){
//        return student.getName() + "-" + student.getAge();
//
//    }
}
