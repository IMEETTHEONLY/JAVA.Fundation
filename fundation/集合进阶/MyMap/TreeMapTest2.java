package 集合进阶.MyMap;

import java.util.TreeMap;

//学生-籍贯题
public class TreeMapTest2 {
    public static void main(String[] args) {

        //创建treeMap，用来存储学生和籍贯的
        TreeMap<Student2,String> map=new TreeMap<>();

        //加入学生
        Student2 s1=new Student2("zhangsan",25);
        Student2 s2=new Student2("lisi",25);
        Student2 s3=new Student2("wangwu",20);
        Student2 s4=new Student2("wangwu",20);

        //再加入的时候它自动会调用comparable方法进行比较构建红黑树
        map.put(s1,"泸县");
        map.put(s2,"泸县");
        map.put(s3,"泸县");
        map.put(s4,"泸县");

        //打印
        System.out.println(map);
    }
}
