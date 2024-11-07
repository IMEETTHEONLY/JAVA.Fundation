package myconvertStreamDemo1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {

    public static void main(String[] args) throws IOException {

        /*
        *       利用转换流按照指定字符编码写出
        *
        * */


        //jdk11以前的方法
//        //创建转换流对象
//        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("myio\\h.txt"),"GBK");
//
//        //向文件当中写入数据
//        osw.write("你好你好");
//
//        //关闭流
//        osw.close();

        //jdk11以后的方法
        //因为filewriter继承了字符转换流，所以说可以指定字符类型
        FileWriter fw=new FileWriter("myio\\h.txt", Charset.forName("GBK"));

        //写入文件
        fw.write("男孩女孩");

        //关闭流
        fw.close();
    }
}
