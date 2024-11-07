package myconvertStreamDemo1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {

        /*
        *
        *       利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
        *
        * */
        //思路:同时满足字节流(转换流)，不能出现乱码(文件是gbk文件)，读一整行(缓冲流)
        //创建字节流
        FileInputStream fis=new FileInputStream("myio\\h.txt");
        //包装字节流为转换流
        InputStreamReader isr=new InputStreamReader(fis,"GBK");
        //将转换流转换为缓冲流
        BufferedReader br=new BufferedReader(isr);

        //从文件当中读取数据
        String string = br.readLine();
        System.out.println(string);

        //关闭流
        br.close();

    }


}
