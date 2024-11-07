package myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo1 {

    public static void main(String[] args) throws IOException {

        /*
        *
        *      利用文件解压流解压文件
        *
        *       解压缩步骤:
        *       1.关联需要解压的文件  关联要解压到的位置
        *       2.读取压缩文件的每一个zipentry对象
        *       3.获取到了每一个entry对象,可能是文件，也可能是目录,进行判读
        *       4.目录的化就创建(文件的路径获取是重点理解)   相当于就是在解压位置的下从根目录开始放
        *       5.文件的化就复制
        * */

        //关联需要解压的文件
        File src=new File("C:\\FileTest\\aaa.zip");

        //关联要解压到的位置
        File dest=new File("C:\\FileTest\\");


        unzip(src,dest);
    }

    //用来解压的函数
    public static void unzip(File src,File dest) throws IOException {
        //首先读取压缩文件的每一个zipentry对象
        ZipInputStream zis=new ZipInputStream(new FileInputStream(src));

        //获取zipentry对象,它会获取目录里面的每一个子目录里面的路径，直到为空，就获取完毕了
        ZipEntry nextEntry;
        while ((nextEntry=zis.getNextEntry())!=null){
           // System.out.println(nextEntry);
            //这里就获取到了每一个entry对象,可能是文件，也可能是目录,进行判读
            //创建输出流


            //判断是目录还是文件
            if(nextEntry.isDirectory()){
                //此时就创建目录
                //获取文件路径   dest这个路径是大路径，后面是解压里面的路径
                File file=new File(dest,nextEntry.toString());
                file.mkdirs();   //多级创建目录，因为aaa这个目录它不进入循环，而是直接有aaa\\之类的路径
            }
            else {
                //括号里面的路径跟创建目录的路径是一样的
                FileOutputStream fos=new FileOutputStream(new File(dest,nextEntry.toString()));
                //复制文件过去
                byte[] bytes=new byte[1024];
                int len;
                //这里为什么是用zis来写，因为entry实际上是对file的封装，获取每个entry的时候，相当于对当前文件开启了流，所以说zis操作的是当前文件
                while ((len=zis.read(bytes))!=-1){
                    fos.write(bytes);
                }
                //关闭流
                fos.close();
            }

            //关闭流
            //fos.close();

        }

        //关闭流
        zis.close();


    }





}
