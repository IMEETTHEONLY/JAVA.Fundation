package mytest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test08 {

    public static void main(String[] args) throws IOException {
        /*
        *       需求:
        *           将多个自定义对象序列化到文件当中，但是对象个数不确定，该如何操作呢?
        *        其实就是用一个ArrayList来装学生对象，因为Arraylist底层是实现了Serializable所以说可以序列化
        *
        * */

        //序列化多个对象
        Student1 s1=new Student1("zhangsan",23);
        Student1 s2=new Student1("lisi",24);
        Student1 s3=new Student1("wangwu",25);


        //创建序列化对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("myio\\object.txt"));

        //创建Arraylist
        ArrayList<Student1> student1s=new ArrayList<>();
        student1s.add(s1);
        student1s.add(s2);
        student1s.add(s3);

        //序列化到文件
        oos.writeObject(student1s);

        //关闭流
        oos.close();

    }
}
