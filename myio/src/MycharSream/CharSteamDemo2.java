package MycharSream;

import java.io.FileReader;
import java.io.IOException;

public class CharSteamDemo2 {

    public static void main(String[] args) throws IOException {
        /*
         *
         *       使用:FileReader方法:(利用有参raed读取数据)
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


        int len;  //每次读取的长度，也是迭代器移动的次数
        char[] chars=new char[2];

        //利用read(char[] buffer)来读取数据
        //有参构造的底层：读取数据+解码+强转三者合一了(数组他就是char的)
        while((len= fr.read(chars))!=-1) {
            //这里如果说每次打印换行就会出现，每次读到行尾就会读到\r\n所以说，会出现读取到两个打印出一个字符的情况(还有一个字符是\r)
            System.out.print(new String(chars));
        }

        //释放资源
        fr.close();
    }
}
