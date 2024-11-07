package File;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        /*
        *   在当前模块的aaa文件夹创建一个a.txt文件
        * */
        //我在创建项目的时候
        File f1=new File("aaa");

        //在当前模块下创建一个新目录
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);

        //在aaa下创建一个文件a.txt

        //第一个参数是父级路径，第二个参数是子级路径
        File f2=new File(f1,"a.txt");
        boolean newFile = f2.createNewFile();
        System.out.println(newFile);


        if(newFile==true){
            System.out.println("创建成功");
        }
        else {
            System.out.println("创建失败");
        }
    }
}
