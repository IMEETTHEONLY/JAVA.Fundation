package 集合进阶.MyCollection;

import java.util.ArrayList;
import java.util.Collection;

//验证contain的底层逻辑
public class CollectionDemo2 {
    public static void main(String[] args) {

        Collection<Student> coll=new ArrayList<>();

        //创建对象
        Student s1=new Student("zhangsan",24);
        Student s2=new Student("lisi",20);
        Student s3=new Student("wangwu",21);

        //添加到集合
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4=new Student("wangwu",21);

        //判断s4是否在集合
        //不重写equals，默认使用object的方法，比较地址。
        System.out.println(coll.contains(s4));

    }
}
