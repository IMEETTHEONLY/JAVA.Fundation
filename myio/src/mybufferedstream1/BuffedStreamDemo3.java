package mybufferedstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffedStreamDemo3 {


    public static void main(String[] args) throws IOException {

        /*
        *       测试:字符缓冲输入流
        *      构造方法:
        *           public BufferedWriter(writer r)
        *       特有方法:
        *           public void newLine   //跨平台换行
        *
        *
        * */
        BufferedWriter fw=new BufferedWriter(new FileWriter("myio\\buff2.txt"));

        //向文件当中书写
        fw.write("我在测试我写的东西");
        fw.newLine();   //换行

        fw.write("这是换行后的一行");

        //关闭流
        fw.close();
    }
}
