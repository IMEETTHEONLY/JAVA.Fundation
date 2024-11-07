package 集合进阶.MySet;

import java.util.HashSet;
import java.util.Set;

//HashSet的小练习
public class HashTest {
    public static void main(String[] args) {

        //创建对象
        Student s1=new Student("张三",23);
        Student s2=new Student("李四",23);
        Student s3=new Student("王五",23);
        Student s4=new Student("张三",23);

        //创建集合,来进行去重
        Set<Student> s=new HashSet<>();
        //如果说不重写，就根据地址值计算hashcode,就不会去重
        System.out.println(s.add(s1));
        System.out.println(s.add(s2));
        System.out.println(s.add(s3));
        System.out.println(s.add(s4));


        System.out.println(s);

    }
}
