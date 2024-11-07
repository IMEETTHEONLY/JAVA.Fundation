package mytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02_awei {
    /*
     *       练习2:
     *       对文件进行加密。
     *       加密原理:
     *           对原始文件的每一个字节数据进行更改，将更改过的数据存储到新的文件当中。
     *       解密原理:
     *       读取加密的文件，然后按照加密的规则反向操作，变成原始文件。
     *
     *      巧妙的使用:^  异或标志
     *      一个数字异或另外一个数字，得到自己本身
     * */

    public static void main(String[] args) throws IOException {
        //要解密的时候直接，拿着被加密的文件再去异或一遍(就是执行代码即可)

        //关联要加密的文件
        FileInputStream fis=new FileInputStream("myio\\ency.txt");

        //创建加密文件

        FileOutputStream fos=new FileOutputStream("myio\\redu.txt");

        //进行加密操作
        int b;
        while ((b=fis.read())!=-1){
            fos.write(b^520);
        }

        //关闭流
        fos.close();
        fis.close();
    }

}
