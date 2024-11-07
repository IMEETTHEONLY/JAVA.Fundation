package MybyteStream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {

        /*
        *
        *       小练习:文件拷贝
        *       注意点:选择一个比较小的文件，文件不要太大。
        *       核心要点：边读边写
        *
        *       课堂小练习:统计拷贝的时长
        * */

        //创建对象
        FileInputStream fis=new FileInputStream("C:\\FileTest\\1.mp4");
        FileOutputStream fos=new FileOutputStream("myio\\copy.mp4");

        //核心代码
        int b;  //用来接收读取的一个字符
        long start = System.currentTimeMillis();
        while ((b=fis.read())!=-1){
            //写入文件
            fos.write(b);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件拷贝的时长度是:"+(end-start));
        //关闭文件，采取栈的思想
        fos.close();
        fis.close();
    }
}
