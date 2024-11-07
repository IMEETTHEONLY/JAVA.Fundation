package 集合进阶.MyMap;

import java.util.HashMap;

//学生-籍贯题
public class MapTest1 {
    public static void main(String[] args) {

        //创建hashmap对象
        HashMap<Student,String> map=new HashMap<>();

        //创建学生对象和籍贯
        Student s1=new Student("zhangsan",22);
        Student s2=new Student("lisi",23);
        Student s3=new Student("wangwu",26);
        Student s4=new Student("zhangsan",23);

        //加入容器
        map.put(s1,"泸县");
        map.put(s2,"广东");
        map.put(s3,"北京");
        map.put(s4,"湖南");

        //遍历
        System.out.println(map);
    }
}
