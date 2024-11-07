package myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


//自己写的版本，它不能压缩为压缩包，并且复制文件产生乱码
public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        *
        *       需求:把文件夹aaa压缩成压缩包
        *       思路:实质上是将文件夹里面的文件和文件夹(牵扯到递归了)转换成zipentry对象，然后放到压缩包当中去
        * */
        //要被压缩的文件
        File src=new File("C:\\FileTest\\aaa");

        //压缩到的位置
        File dest=new File(src.getParent(),src.getName()+".zip");

        //System.out.println(dest);

        zipDir(src,dest,src.getName());

    }

    //递归三要素之一:参数和返回值
    public static void zipDir(File src,File dest,String name) throws IOException {
        //先遍历当前目录里面有哪些文件或者是目录
        File[] files = src.listFiles();

        //递归三要素之二:结束条件
        if(files==null){
            return;
        }

        //递归三要素之三:递归规则
        for (File file : files) {
            //判断是文件还是文件夹

            if(file.isFile()){
                //此时是文件
                //将当前文件封装成为zipentry对象写入压缩包当中

                //创建zipentry对象
                //这个地址和递归的一样，它表示在zip里面还要创建一层相同的目录  比如说aaa.zip 里面还要有aaa
                ZipEntry zipEntry=new ZipEntry(name+"\\"+file.getName().toString());

                //创建压缩流将zipentry放入压缩包
                ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(dest,name+"\\"+file.getName().toString())));
                //由于系统默认的系统是gbk所以说要转换流
                OutputStreamWriter osw=new OutputStreamWriter(zos,"GBK");
                zos.putNextEntry(zipEntry);

                //再把数据传输过去
               InputStreamReader isr=new InputStreamReader(new FileInputStream(file),"GBK");
                int b;
                while ((b=isr.read())!=-1){
                    osw.write(b);
                }

                //关流
                osw.close();
                isr.close();


            }

            else {
                System.out.println(file);
                //此时是文件夹
                File f=new File(dest,name+"\\"+file.getName().toString());
                f.mkdirs();

                //递归
                zipDir(file,new File(f.getParent()),file.getName());
            }



        }


    }



}
