package 方法引用;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        //只获取学生姓名并放到数组当中

        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student("张三",21);
        Student s2=new Student("王五",61);
        Student s3=new Student("李四",21);
        Collections.addAll(list,s1,s2,s3);


        //先使用常规方法
        //方法:将student->String类型，然后保存string到数组即可

//        List<String> collect = list.stream().map(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                String name = student.getName();
//                return name;
//            }
//        }).collect(Collectors.toList());
//
//        System.out.println(collect);


        //方法引用的方法   //引用静态方法
//        List<String> collect = list.stream().map(Test2::trasfer).collect(Collectors.toList());
//        System.out.println(collect);


        //方法引用的方法   //引用成员方法  类名+成员方法要满足一定的规则，只能引用抽象方法第一个类里面的方法
        List<String> collect1 = list.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(collect1);
    }

    public static String trasfer(Student student){
        return student.getName();
    }

    public  String trasfer1(Student student){
        return student.getName();
    }
}
