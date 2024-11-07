package MybyteStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        *        FileInputSteam流的基本用法
        *         实现读取  c.txt文件里面的内容
        *
        *       实现步骤:
        *           创建对象
        *           读取数据
        *           释放资源
        *
        *
        * */
        FileInputStream fis=new FileInputStream("myio\\a.txt");

        //读取数据
        //read每次读取一个字符，并返回它的assc码的整数值
        int read1 = fis.read();
        System.out.println((char) read1);

        int read2 = fis.read();
        System.out.println((char) read2);

        //细节:当文件的内容读取完毕了以后，读取出来的就是-1
        int read3 = fis.read();
        System.out.println( read3);

        //关闭文件
        fis.close();
    }
}
