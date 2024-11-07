package myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {


    public static void main(String[] args) throws IOException {

        /*
        *
        *       目标:对单个文件进行压缩
        *       实质:写入zipentry的过程
        *       先创建一个文件名+zip,然后在将文件封装成为zipkey写入压缩文件当中实现压缩文件。
        *
        *       步骤；
        *       1.关联要压缩的文件
        *       2.创建zipentry对象,并将此对象关联要压缩到的文件
        *       3.然后将此对象加入到压缩包里面去
        *       4.用zos流将压缩内容写入
        * */
        //关联要压缩的文件
        File src=new File("C:\\FileTest\\b.txt");

        //创建要压缩到的位置  一定要以.zip结尾，这样系统才能识别它是一个压缩文件
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(src.getParent(),"b.zip")));

        //System.out.println(dest);

        //创建zipentry对象,并将此对象关联要压缩到的文件
        ZipEntry zipEntry=new ZipEntry("b.txt");

        //然后将此对象加入到压缩包里面去
        zos.putNextEntry(zipEntry);

        //这里还是一样，此时的zipentry关联的是b.txt所以说，此时zos开启了向b.txt的流
        //向文件写入数据即可
        //因为要复制所以说实例一个输入流对象
        FileInputStream fis=new FileInputStream(src);
        int b;
        while ((b=fis.read())!=-1){
            zos.write(b);
        }

        //关流
        fis.close();
        zos.close();

    }
}
