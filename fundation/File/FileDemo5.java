package File;

import java.io.File;

public class FileDemo5 {

    public static void main(String[] args) {

        //public boolean delete()


        //作用:删除文件(不论是否为空)  或者是空文件夹
        //细节
        /*
        *       1.如果说删除文件无论是否为空，直接删除不走回收站
        *        2.空目录一样的
        *        3.非空目录删除失败
        * */
        //删除文件
//        File file1=new File("C:\\FileTest\\a.txt");
//        boolean delete = file1.delete();
//        System.out.println(delete);


        //删除空目录
        File file2=new File("C:\\FileTest\\eee");
        boolean delete1 = file2.delete();
        System.out.println(delete1);

    }
}
