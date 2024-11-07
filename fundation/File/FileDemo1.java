package File;

import java.io.File;

public class FileDemo1 {

    public static void main(String[] args) {

        /*
        *   File的三种构造方法
        *   File(pathname)
        *   File(String parent,String child)
        *   File(File parent,String child)
        *
        * */

        //第一种构造方法
        //java当中\的意思是转义字符，所以说\\才是斜杠的意思
        String str="C:\\FileTest\\tset";
        File file1=new File(str);
        System.out.println(file1);

        //第二种构造方法
        //parent就是除了最低级目录的其他文件目录  子级目录不用打反斜杠，java会自己给你加
        String parent1="C:\\FileTest";
        String child1="tset";
        File file2=new File(parent1,child1);
        System.out.println(file2);

        //第三种种构造方法
        File parent2=new File("C:\\FileTest");
        String child2="tset";
        File file3=new File(parent2,child2);
        System.out.println(file3);
    }
}
