package MycharSream;

import java.io.FileReader;
import java.io.IOException;

public class CharSteamDemo1 {

    public static void main(String[] args) throws IOException {

        /*
        *
        *       使用:FileReader方法:(利用空参raed读取数据)
        *       1.创建对象
        *       public FileReaer(String pathname)
        *       public FileReaer(File file)
        *       2.读取数据
        *       public int read()   //一次读取一个数据
        *       public int read(char[] buffer)   //一次读取多个数据保存倒数
        *       3.释放资源
        *       public void close
        *
        * */

        //创建对象
        FileReader fr=new FileReader("myio\\d.txt");

        //利用read来读取数据

        /*
        *   read细节:read是底层也是一个一个字节的读取数据的，但是遇见中文就会一次性读取多个字节。
        *   在读取完数据以后还会将二进制数据转换为十进制。这个十进制就表示在字符集上面对应的数据。
        *    所以说需要看到字符，还要进行对整型强转。
        *
        *
        * */
        int b;
        while((b= fr.read())!=-1) {
            System.out.print((char) b);
        }

        //释放资源
        fr.close();


    }

}
