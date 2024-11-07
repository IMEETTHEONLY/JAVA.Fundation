package File;

import java.io.File;

public class FileDemo6 {

    public static void main(String[] args) {

        /*
        *       遍历文件夹
        *   public File[] listFiles(String pathname)   参数就是file的路径
        *   作用是遍历文件夹里面的所有内容(绝对路径)，并放进数组里面
        *   它不能遍历文件，它遍历文件的结果是返回null。
        *
        * */

        //注意事项:只能遍历文件夹，遍历文件返回null
        File f=new File("C:\\FileTest");

        //调用listFiles遍历f目录  返回到一个file数组当中
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
