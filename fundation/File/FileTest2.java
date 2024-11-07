package File;

import java.io.File;

public class FileTest2 {

    public static void main(String[] args) {
        /*
        *       定义一个方法查找某个文件夹中,是否有以avi结尾的电影
        *
        * */

        File f=new File("C:\\FileTest\\aaa");

        //利用filelists遍历文件夹里面的内容
        File[] files = f.listFiles();

        for (File file : files) {
            //条件过滤:以avi结尾的打印出来
            if(file.getName().endsWith("avi")){
                System.out.println(file);
            }
        }
    }
}
