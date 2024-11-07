package MybyteStream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo7 {
    /*
    *
    *       利用:try catch finaly来捕获可能出现异常的代码
    *       由于close是必须执行的代码，即如果说放在产生异常的代码可以执行不到，所以说要放到final里面去
    * */


    public static void main(String[] args) {

        //在这里声明。final里面才能使用
        FileInputStream fis=null;  //必须赋值为null，否则代码会可能未赋值异常
        FileOutputStream fos=null;


        try {
            //创建对象
             fis=new FileInputStream("C:\\FileTest\\1.mp4");
             fos=new FileOutputStream("myio\\copy.mp4");

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
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭文件，采取栈的思想

            //由于文件的路径可能不存在，所以说返回空的file，如果说是空的file就不关闭了，否则会报空指针异常
           if(fos!=null){
               try {
                   fos.close();
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }
           if(fis!=null){
               try {
                   fis.close();
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }
        }


    }
}
