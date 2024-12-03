package myiotest3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
        *
        *   利用Properties,将配置文件当中的键值对读取到程序当中来
        * */
        Properties p=new Properties();

        //创建输入流
        FileInputStream fis=new FileInputStream("myiotest\\a.properties");
        p.load(fis);
        //关流
        fis.close();

        //打印集合
        System.out.println(p);
    }
}
