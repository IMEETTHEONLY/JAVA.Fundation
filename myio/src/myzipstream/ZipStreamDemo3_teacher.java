package myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3_teacher {


    public static void main(String[] args) throws IOException {

        /*
        *       这是压缩文件夹阿伟的版本
        *
        * */

        //创建File对象表示要压缩的文件夹
        File src=new File("C:\\FileTest\\aaa");

        //创建File对象表示压缩包放在哪里
        File destParent=new File("C:\\FileTest");

        //创建File对象表示zip包放的位置
        File dest=new File(destParent,src.getName()+".zip");

        //创建压缩流关联要压缩到的位置
        //这里关联的压缩路径，会将函数处理的所有路径自动创建出来
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(dest));

        //调用函数压缩目录
        zipDir(src,zos,src.getName());

        //关流
        zos.close();

    }
    //参数name表示每一次递归的父级路径
    public static  void zipDir(File src,ZipOutputStream zos,String name) throws IOException {
        //先得到每一个文件
        File[] files = src.listFiles();

        //判断是文件还是目录
        for (File file : files) {

            if(file.isFile()){

                //处理文件的操作
                //创建zipentry对象
                //路径为；父级路径+子路径
                ZipEntry zipEntry=new ZipEntry(name+"\\"+file.getName());
                //将zipEntry放入zos压缩流
                zos.putNextEntry(zipEntry);

                //将数据写过去
                FileInputStream fis=new FileInputStream(file);
                int b;
                while ((b=fis.read())!=-1){
                    zos.write(b);
                }

                //关闭流
                fis.close();
            }

            else {

                //处理目录的操作
                //创建目录并递归

                zipDir(file,zos,name+"\\"+file.getName());
            }
        }


    }
}
