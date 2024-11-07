package mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test09 {

    /*
    *       读取object.txt文件当中的序列化的ArrayList
    *
    * */

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //创建对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("myio\\object.txt"));

        //读取集合并强转
        ArrayList<Student1> s = (ArrayList<Student1>) ois.readObject();

        //打印
        System.out.println(s);
        //关闭流
        ois.close();
    }
}
