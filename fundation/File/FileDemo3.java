package File;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) {

        /*
        *       File的获取成员方法
        *       public long length();
        *       public String AbsolutePath();
        *       public String Path();
        *       public String getName();
        *       public Long lastmodify()
        *
        *
        * */
        //获取length()
        //细节一:这个方法只能获取文件的大小单位是字节
                //如果说想获取G,M那么就得除以1024
        //细节二:这个方法无法获取目录的大小
                //获取目录大小的方法就是，将里面的文件全部相加

        //获取文件length
        File file1=new File("C:\\FileTest\\a.txt");
        long length = file1.length();
        System.out.println(length);

        //获取目录length
        //可以看到目录不为空但是，获取长度为零
        File file2=new File("C:\\FileTest\\aaa");
        long length1 = file2.length();
        System.out.println(length1);

        //AbsolutePath,它的作用就是无论你传递给他的参数即构造方法是什么，他都给你返回绝对路径
        File file3=new File("test.txt");
        File absoluteFile = file3.getAbsoluteFile();
        System.out.println(absoluteFile);

        //Path  它给你返回的是构造方法当中的路径
        File file4=new File("test.txt");
        String path = file4.getPath();
        System.out.println(path);

        //getName获取文件/目录的名字
        File file5=new File("C:\\FileTest\\a.txt");
        String name = file5.getName();
        System.out.println(name);


        //lastmodify  获取最后修改的时间
        File file6=new File("C:\\FileTest\\aaa");
        long l = file6.lastModified();
        System.out.println(l);


        //课堂作业:将long整数的时间戳转换为，标准时间格式的时间
        //先将时间戳转换为date对象  它是桥梁
        Date date=new Date(l);
//        System.out.println(date);
        //再利用simpleDateFormat对象进行格式化
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = s.format(date);
        System.out.println(format);
    }
}
