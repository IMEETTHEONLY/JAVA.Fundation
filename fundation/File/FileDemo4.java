package File;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args)   {
        /*
        *       public boolean createNewFile()
        *       public boolean mkdir()
        *       public boolean mikdrs()
        *       public boolean delete()
        *
        * */


        //createNewFile方法
        //细节
        /*
        *   情况1:当前文件路径的文件是不存在的，那么创建文件，并且返回true
        *   情况2:当前文件路径的文件是存在的，那么创建失败，返回false
        *   情况3:如果说父级文件的路径不存在，那么方法会有IOE异常
        *
        * */
        //细节二:创建的一定是文件，如果说不加后缀名，则创建一个没有后缀名的文件
//        File file1=new File("C:\\FileTest\\test");
//        boolean newFile = file1.createNewFile();
//        System.out.println(newFile);


        //mkdir方法
        //方法细节:
        //细节一:mkdir只能创建单极目录,单极目录的含义是在已经存在的路径上多加一级
        //细节二:文件路径若已经存在，则创建失败(不能与文件名同名)
//        File file2=new File("C:\\FileTest\\eee\\ccc\\ddd\\aaa\\nnn");
//        boolean mkdir = file2.mkdir();
//        System.out.println(mkdir);

        //mkdir
        //可以创建多级文件
        //细节:mkdirs的底层就是使用了mkdir来进行判断，所以说mkdirs完全可以替代掉mkdir
        File file3=new File("C:\\FileTest\\eee\\ccc\\ddd\\aaa\\nnn");
        boolean mkdirs = file3.mkdirs();
        System.out.println(mkdirs);

    }
}
