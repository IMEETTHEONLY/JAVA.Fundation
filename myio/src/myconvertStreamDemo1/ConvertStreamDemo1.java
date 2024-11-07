package myconvertStreamDemo1;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {

    public static void main(String[] args) throws IOException {

        /*
        *       利用转换流按照字符编码读取
        *
        * */
        //jdk11前的版本
//        InputStreamReader isr=new InputStreamReader(new FileInputStream("C:\\FileTest\\gbkfile.txt"),"GBK");
//
//        //读取文件
//        int len;
//        while ((len=isr.read())!=-1){
//            System.out.print((char) len);
//        }
//        //关闭流
//        isr.close();


        //jdk11以后的版本
        //创建对象
        FileReader fr=new FileReader("C:\\\\FileTest\\\\gbkfile.txt", Charset.forName("GBK"));

        //读取文件
        int b;
        while ((b=fr.read())!=-1){
            System.out.print((char) b);
        }

        //关闭流
        fr.close();
    }


}
