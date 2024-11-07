package mytest;

import java.io.*;
import java.util.Arrays;

public class Test02 {

    /*
    *       练习2:
    *       对文件进行加密。
    *       加密原理:
    *           对原始文件的每一个字节数据进行更改，将更改过的数据存储到新的文件当中。
    *       解密原理:
    *       读取加密的文件，然后按照加密的规则反向操作，变成原始文件。
    *
    *
    * */
    public static void main(String[] args) throws IOException {
        //我的思路就是一个数据一个数据(英文一个字节，中文三个字节)的从文件读数据出来，然后再把每个数据的数字+9(当然可以采用循环加不一样的值)
        FileReader fr=new FileReader("myio\\d.txt");
        FileWriter fw=new FileWriter("myio\\secret.txt");

        //进行文件加密操作
        //从文件一个一个字节的把数据读取出来
        int b;
        while ((b= fr.read())!=-1){
            fw.write(b+9);
        }

        //关闭流
        fw.close();
        fr.close();


        //再创建流，从secert.txt中读取数据
        FileReader fis2=new FileReader("myio\\secret.txt");

        //按照一个字符一个字符的读取
        int b1;
        while ((b1=fis2.read())!=-1){
            System.out.print((char) (b1-9));
        }


        fis2.close();
    }

}
