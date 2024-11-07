package myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
         *
         *       需求:利用序列化流/对象操作输出流，把一个对象写道本地文件当中
         *       构造方法:
         *       public ObjectInputStream(InputStream out)
         *
         *       成员方法；
         *       public final void readobejct(Object obj)
         * */


        //创建反序列化对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("myio\\o.txt"));

        //读取数据
        Object o = ois.readObject();

        //打印数据
        System.out.println(o);

        //释放资源
        ois.close();
    }





}
