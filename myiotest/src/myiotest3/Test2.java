package myiotest3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
        * Properties的特殊用法:将键值对写道文件当中
        * */
        Properties p=new Properties();

        //加入元素
        p.put("aaa","111");
        p.put("bbb","www");
        p.put("ccc","hhh");
        p.put("ddd","mmm");

        //创建输出流
        FileOutputStream fos=new FileOutputStream("myiotest\\a.properties");
        //调用方法写出数据
        p.store(fos,"test");
        //关流
        fos.close();
    }
}
