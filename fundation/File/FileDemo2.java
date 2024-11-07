package File;

import java.io.File;

public class FileDemo2 {

    public static void main(String[] args) {

        /*
        *
        *       File的判断方法
        *      public boolean isDirectroy()
        *      public boolean isFile()
        *      public boolean exists()
        *
        * */


        //对一个文件的路径进行判断
        File file1=new File("C:\\FileTest\\a.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());


        System.out.println("================");

        //对一个目录路径进行判断
        File file2=new File("C:\\FileTest\\aaa");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());

        System.out.println("===============");

        //对不存在的路径进行判断
        File file3=new File("C:\\FileTest\\ddd");
        System.out.println(file3.isDirectory());
        System.out.println(file3.isFile());
        System.out.println(file3.exists());
    }
}
