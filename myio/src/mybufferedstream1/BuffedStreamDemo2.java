package mybufferedstream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffedStreamDemo2
{

    public static void main(String[] args) throws IOException {

        /*
        *       测试:字符缓冲输入流
        *       构造方法:
        *        public BuffedReader(Reader r)
        *       特有方法:
        *       public String readline()
        *
        *
        * */
        //创建对象
        BufferedReader br=new BufferedReader(new FileReader("myio\\buff1.txt"));

        //利用特有方法读取一行一行的读
        //细节:这个方法遇见换行就读一次，但是不会把回车换行读入内存当中，所以说你要字节换行
        String str="";

        while ((str=br.readLine())!=null){
            System.out.println(str);
        }

        //关闭流
        br.close();

    }

}
