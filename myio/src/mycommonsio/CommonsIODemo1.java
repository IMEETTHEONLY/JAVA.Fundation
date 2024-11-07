package mycommonsio;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class CommonsIODemo1 {


    public static void main(String[] args) throws IOException {

        /*
        * 测试FileUtils类的方法  和 IOUtils类的方法
        *
        *
        *           FileUtils类:
                    static void copyFile(File srcFile, File destFile)
                    static void copyDirectory(File srcDir, File destDir)
                    static void copyDirectoryToDirectory(File srcDir, File destDir)
                    static void deleteDirectory(File directory)
                    static void cleanDirectory(File directory)
                    static String readFileToString(File file, Charset encoding)
                    static void write(File file, CharSequence data, String encoding)
                    IOUtils类
                        public static int copy(InputStream input, OutputStream output)
                        public static int copyLarge(Reader input, Writer output)
                        public static String readLines(Reader input)
                        public static void write(String data, Outputstream output)
        *
        * */

//        FileUtils类
        //拷贝文件
//        File src=new File("myio\\src\\Filepacket\\a.txt");
//        File dest=new File("myio\\src\\Filepacket\\b.txt");
//        FileUtils.copyFile(src,dest);


        //复制文件夹---1
        //它是原样的复制文件夹到目标目录
//        File src1=new File("C:\\FileTest\\aaa");
//        File dest1=new File("C:\\FileTest\\kkk");
//        FileUtils.copyDirectory(src1,dest1);


        //复制文件夹----2
//        在kkk里面再复制aaa，嵌套的感觉
//        File src2=new File("C:\\FileTest\\aaa");
//        File dest2=new File("C:\\FileTest\\kkk");
//        FileUtils.copyDirectoryToDirectory(src2,dest2);

        //删除文件夹
//        File file=new File("C:\\FileTest\\kkk");
//        FileUtils.deleteDirectory(file);

        //清空文件夹
//        File file=new File("C:\\FileTest\\kkk");
//        FileUtils.cleanDirectory(file);

        //将文件的内容读出为字符串
//        File file=new File("C:\\FileTest\\c.txt");
//        String string = FileUtils.readFileToString(file, Charset.forName("GBK"));
//        System.out.println(string);

        //将内容写道文件
//        File file=new File("C:\\FileTest\\c.txt");
//        FileUtils.write(file,"我曾经爱过了，但也是曾经的事情","GBK");


//        IOutils类

        IOUtils.copy(new FileInputStream("myio\\src\\Filepacket\\c.txt"),new FileOutputStream("myio\\src\\Filepacket\\d.txt"));
        //IOUtils.close();
    }
}
