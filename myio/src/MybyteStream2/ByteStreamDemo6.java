package MybyteStream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {


        /*
        *   文件拷贝:升级版   利用数组来拷贝
        *
        * */

        //创建对象
        FileInputStream fis=new FileInputStream("C:\\FileTest\\1.mp4");
        FileOutputStream fos=new FileOutputStream("myio\\copy.mp4");

        //核心代码
        int len;  //用来表示此次读取到了几个数据
        byte[] bytes=new byte[1024*1024*5];  //每次读到到这个数组当中
        long start = System.currentTimeMillis();
        while ((len=fis.read(bytes))!=-1){
            //写入文件
            fos.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件拷贝的时长度是:"+(end-start));
        //关闭文件，采取栈的思想
        fos.close();
        fis.close();

    }
}
