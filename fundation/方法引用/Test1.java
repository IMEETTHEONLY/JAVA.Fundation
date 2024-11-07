package 方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        //将数据收集到Student类型的数组当中(使用方法引用完成)

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三,23","李四,25","王五,64");

        //先使用steam流常规方式完成
        Student[] array = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                //将s的信息封装在student当中
                Student student = new Student();
                String[] split = s.split(",");
                student.setName(split[0]);
                student.setAge(Integer.parseInt(split[1]));
                return student;
            }
        }).toArray(Student[]::new);

        System.out.println(Arrays.toString(array));

        //采用方法引用----引用构造方法
        //调用student和抽象方法一样的返回类型和参数的构造方法
        Student[] array1 = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(array1));
    }
}
