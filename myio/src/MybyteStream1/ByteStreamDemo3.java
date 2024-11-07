package MybyteStream1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {

    public static void main(String[] args) throws IOException {

        /*
        *
        *       数据写出的三种方式:
        *           void wirte(int b)   一次写一个字节数据
        *           void write(byte[] b)    一次写一个字节数组数据
        *           void write(byte[] b,int off, int len)   //一次写数组的一部分数据
        *
        *
        * */

        //创建字符输出流对象
        //创建新的文件
        FileOutputStream fos=new FileOutputStream("myio\\b.txt");

        //一次写一个字符数组
        //整数代表的是acss表里面的值,而不是本身
        byte[] b={97,98,99,100,101};
        //将字符数组写出b.txt
        fos.write(b);

        //将部分写入文件
//        off是起始位置,len是写多长
        fos.write(b,1,2);

        //关闭文件
        fos.close();



    }
}
