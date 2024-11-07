package mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo1 {

    public static void main(String[] args) throws IOException {

            /*
            *       需求:利用字符缓冲流拷贝文件
            *
            *       字符缓冲输入流的构造方法:
            *               public BufferedInputStream(InputStream is)
            *
            *       字符缓冲输出流的构造方法:
            *               public BufferedOutputSream(OutputSream os)
            *
            *       细节1:字符缓冲***最重要的就是在new的时候会创建出一个buff数组出来
            *       细节2:再关闭缓冲流的时候，方法内部会关闭低级流
            * */
        //可以有第二个参数，表示缓冲区的大小   其实高级io就是包装低级io，然后实现更多的功能
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("myio\\buff1.txt"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("myio\\buff2.txt"));

        //开始拷贝数据
        int b;
        while((b=bis.read())!=-1){
            bos.write(b);
        }

        //关闭流
        bos.close();
        bis.close();

    }
}
