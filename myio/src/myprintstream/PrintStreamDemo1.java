package myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStreamDemo1 {

    public static void main(String[] args) throws FileNotFoundException {
      /*  字节打印流：
        构造方法:
            public PrintStream(OutputStream/File/String)    关联字节输出流/文件/文件路径
            public Printstream(String fileName, Charset charset)      指定字符编码
            public PrintStream(OutputStreamout, boolean autoFlush) 自动刷新
            public PrintStream(OutputStream out, boolean autoFlush, String encoding)
        成员方法：
        public void write(int b) 常规方法：规则跟之前一样，将指定的字节写出
        public void println(Xxx xx)  特有方法：打印任意数据，自动刷新，自动换行
        public void print(Xxx xx)   特有方法：打印任意数据，不换行
        public void printf(String format, Object... args)   特有方法：带有占位符的打印语句，不换行
*/
        //创建对象(这里使用的是第二种构造方法)
        PrintStream ps=new PrintStream(new FileOutputStream("myio\\print.txt"),true, Charset.forName("GBK"));

        //向文件当中写出数据
        ps.write(97);  //和文件输出流一样写出字符
        ps.println();   //换行

        ps.println(97);  //写出97并换行

        ps.print(true);  //写出true不换行

        ps.println();   //换行

        ps.printf("我的年龄是:%d",21);

        //关闭流
        ps.close();
    }



}
