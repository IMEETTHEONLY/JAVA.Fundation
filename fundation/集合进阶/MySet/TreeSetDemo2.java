package 集合进阶.MySet;

import java.util.TreeSet;

//自定义类型数据排序的探究
public class TreeSetDemo2 {
    public static void main(String[] args) {
        //默认排序/自然排序



        //创建三个学生对象
        Student s1=new Student("zhangsan",21);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);

        TreeSet<Student> ts=new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);


        System.out.println(ts);

    }
}
