package myprintstream;

import java.io.*;

public class PrintStreamDemo2 {


    public static void main(String[] args) throws IOException {

        //它比起字节打印流，最大的特点就是它底层有一个缓冲区，然后可以刷新，然后将缓冲区的内容刷到文件当中(否则只有等到文件关闭了才会送到)
        /*字符打印流:
                构造方法
                    public PrintWriter(Write/File/String)   关联字节输出流/文件/文件路径
                    public Printwriter(String fileName,Charset charset)
                    public PrintWriter(Write, boolean autoFlush) 自动刷新
                    public PrintWriter(Write out, boolean autoFlush, String encoding) 指定字符编码并刷新
                成员方法：
                    public void write(int b)   常规方法：规则跟之前一样，将指定的字节写出
                    public void println(Xxx xx)  特有方法：打印任意数据，自动刷新，自动换行
                    public void print(Xxx xx)   特有方法：打印任意数据，不换行
                    public void printf(String format,Object... args)    特有方法：带有占位符的打印语句，不换行
*/

            //创建字符打印流对象
        //ctcl+p可以查看参数，它既可以包装writer，也可以包装outputstream
        PrintWriter pw=new PrintWriter(new FileWriter("myio\\PrintStreamDemo2.txt"),true);

        //向文件当中写入内容
        pw.println("阿珍爱上了矮墙！！！");

        //测试不刷新的方法  print(如果说不关闭流，就写不进去，直到文件关闭了才写入)
        pw.print("在这个美丽的地方");

        pw.printf("%s 大哥 %d","哈哈哈",6);


        //关闭流
        pw.close();


    }
}
