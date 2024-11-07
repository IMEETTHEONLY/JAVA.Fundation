package myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {

        /*
        *
        *       需求:利用序列化流/对象操作输出流，把一个对象写道本地文件当中
        *       构造方法:
        *       public ObjectOutputStream(OutputStream out)
        *
        *       成员方法；
        *       public final void writeobejct(Object obj)
        * */

        //创建学生对象
        Student s=new Student(23,"zhangsan","南京");

        //创建序列化流对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("myio\\o.txt"));

        //向文件当中写入序列化对象
        oos.writeObject(s);

        //关闭流
        oos.close();
    }


}
