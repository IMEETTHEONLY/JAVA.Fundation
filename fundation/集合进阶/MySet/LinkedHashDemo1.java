package 集合进阶.MySet;

import java.util.LinkedHashSet;

//探究LinkedHashSet底层原理
public class LinkedHashDemo1 {
    public static void main(String[] args) {
        //创建四个对象
        Student s1=new Student("张三",23);
        Student s2=new Student("李四",23);
        Student s3=new Student("王五",23);
        Student s4=new Student("张三",23);


        //创建集合
        LinkedHashSet<Student> lhs=new LinkedHashSet<>();

        //重写了equals和hashcode方法，那么就会去重

        //存入的和获取的顺序一样
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s4));

        //打印集合
        System.out.println(lhs);

    }
}
