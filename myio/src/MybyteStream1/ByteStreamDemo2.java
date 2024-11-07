package MybyteStream1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {

    public static void main(String[] args) throws IOException {

        /*
        *       字符输出流的细节:
        *            1.创建字节输出流对象:
        *               细节一:参数可以是字符串表示，也可以是File对象
        *               细节二:如果说文件不存在会创建一个新的文件。但是要保证父级路径存在
        *               细节三:如果说文件已经存在，会清空文件
        *
        *
        *           2.写数据：
        *                   write()的参数是整数，但是传递过去的是对应的assc表的值
        *
        *           3.释放资源
        *               每次使用完后都要释放资源
        *
        *
        * */

            //父级路径要存在
        FileOutputStream fos=new FileOutputStream(new File("myio\\a.txt"));

        //写出字符  其实是assic对应的值
        fos.write(97);
        fos.write(98);

        fos.close();

        //如果说不关闭的话，文件就会一直被占用
//        while (true){
//
//        }
    }
}
