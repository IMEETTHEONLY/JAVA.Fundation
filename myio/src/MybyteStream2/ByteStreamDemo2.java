package MybyteStream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo2 {

    public static void main(String[] args) throws IOException {

        /*
        *   FileInputStream小细节:
        *
        *            创建对象:
        *               文件不存在，直接报错。
        *               java这样设置的原因:核心在于数据，输出流数据从程序当中输出到文件，所以说我们有数据故可以创建新文件存放，
        *               而输入流创建文件没有用因为数据都没有
         *           读取数据
         *              细节1:一次性读取一个字节，读出来的是ascc上对应的数字
         *              细节2:读到文件末尾，返回-1
         *           释放资源
         *              每次使用完流要释放
        *
        * */


        //测试路径不对是否会新创建文件(父路径正确，但是没有子级文件)
        //下面这句代码直接报错
       //FileInputStream fis=new FileInputStream("myio\\d.txt");
       FileInputStream fis=new FileInputStream("myio\\a.txt");
        //读取数据
        //read每次读取一个字符，并返回它的assc码的整数值
        int read1 = fis.read();
        System.out.println((char) read1);

        int read2 = fis.read();
        System.out.println((char) read2);

        //细节:当文件的内容读取完毕了以后，读取出来的就是-1
        int read3 = fis.read();
        System.out.println( read3);


        //关闭流
        fis.close();

    }
}
