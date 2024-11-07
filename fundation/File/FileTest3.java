package File;

import java.io.File;

public class FileTest3 {

    public static void main(String[] args) {

        /*
        *
        *       找到电脑中c盘以avi结尾的电影
        *       注意:中文路径下的目录不可进入，java它系统访问不到。
        *
        * */

        //核心思想:就是递归遍历每一个文件夹，直到文件夹为空为止，然后遇见了.avi结尾的文件打印出来即可
        File f=new File("C:\\");
        findFiles(f);
    }


    //递归三要素之一:确定返回值和函数参数
    //参数就是每次要访问的那个文件夹
    public static void findFiles(File file){

        //先获取当前目录下的所有文件和目录
        File[] files = file.listFiles();

        //三要素之二
        //终止条件
        if(files==null){
            return;
        }
            //三要素之三:
            //递归规则:拿着每个路径判断，倘若是文件就判断是否以avi结尾，若是目录就进入递归
            for (File file1 : files) {
                //file1就是每一个目录里面的文件或者是目录
                //判断它是目录还是文件
                if(file1.isFile()){
                    if(file1.getName().endsWith(".avi")){
                        System.out.println(file1);
                    }
                }


                //它是目录
                else{
                    //递归循环即可
                    findFiles(file1);
                }

            }

    }
}
