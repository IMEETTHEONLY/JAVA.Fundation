package mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {

    public static void main(String[] args) throws IOException {

        /*
        *
        *       拷贝一个文件夹，包含它的子文件夹
        *       //文件夹下面有文件夹还有文件，所以说要进行一个判断
        * */

        File scr=new File("C:\\FileTest\\aaa");
        File dest=new File("C:\\FileTest\\copy");

        copyDir(scr,dest);



    }

    //递归三要素之一:确定返回值和函数参数
                    //函数参数表示当前路径（因为有递归),还有被复制文件的当前路径，由于被复制的路径是随着递归深入而深入，所以说也要把它作为递归条件
    public static void copyDir(File src,File dest) throws IOException {

        //三要素之二:递归结束条件
        File[] files = src.listFiles();
        if(files==null){
            //如果说文件夹为空了，就不继续进行了
            return;
        }

        //三要素之三:递归规则
        for (File file1 : files) {
            //如果说file1是文件
            if(file1.isFile()){

                //进行文件复制   按照字节来复制
                FileInputStream fis=new FileInputStream(file1);
                //重点就是这个被复制到的文件的位置，它是被复制的当前的路径加上文件名
                FileOutputStream fos=new FileOutputStream(new File(dest,file1.getName()));

                //按照数组来进行复制
                byte[] bytes=new byte[1024];
                int len;  //每次读取的长度
                while ((len=fis.read())!=-1){
                    fos.write(bytes);
                }

                //关闭流
                fos.close();
                fis.close();
            }

            //如果说是目录创建目录即可，递归即可
            else{
                //目录的路径构成，将当前目录名字拼接file1的路径子级名字
                File newDir = new File(dest, file1.getName());
                boolean mkdir = newDir.mkdir();
                copyDir(file1,newDir);
            }


        }

    }


}
