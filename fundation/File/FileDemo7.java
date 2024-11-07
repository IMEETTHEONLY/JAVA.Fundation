package File;

import java.io.File;

public class FileDemo7 {

    /*
    *
    *   利用listFiles方法列出路径下的所有.txt文件
    *   在遍历的基础上，加上条件限制
    * */
    public static void main(String[] args) {

        File f=new File("C:\\FileTest");

        //调用listFiles方法，它返回file类型的数组
        File[] files = f.listFiles();
        for (File file : files) {
            //判断是不是以.txt结尾的文件
            if(file.isFile()&& file.getName().endsWith(".txt")){
                System.out.println(file);
            }
        }


    }
}
