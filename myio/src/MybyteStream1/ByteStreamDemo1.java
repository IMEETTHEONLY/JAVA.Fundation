package MybyteStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {

    public static void main(String[] args) throws IOException {

        /*
        *       演示:字节输出流FileOutputStream
        *       实现需求:写一段文字到本地中
        *
        *       实现步骤:
        *               创建对象
        *               写出数据
        *               释放资源
        *
        *
        * */

        //创建文件输出对象，并指定路径
        FileOutputStream fos=new FileOutputStream("myio\\a.txt");

        //写出数据
        fos.write(97);

        //每次使用完了都要关闭管道
        fos.close();

    }


}
