package MybyteStream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {

    public static void main(String[] args) throws IOException {

        /*
        *
        *          换行和续写
        *           换行写:
        *           windows:\r\n   \r的意思是回到行首(回车)，\n是换行
        *           Linux:   \n
        *           Mac；  \r
        *
        *           细节:windows当中java在底层对回车换行进行了优化,
        *           虽然说完整的是\r\n但是你只需要任意写一个\r或者\n即可
        *           它会自动给你补全。
        *
        *
        *           续写:你只需要在new的时候，打开append开关即可,创建对象的第二个参数
        *
        *
        * */
                                //第二个参数是开启续写的开关   设置为true的话那么就会一直往文件添加相同的内容
        FileOutputStream fos=new FileOutputStream("myio\\c.txt",true);

        //首先实现换行操作
        //细节:string用一个getbyte方法，它可以将字符串转换为byte数组
        String str1="wqshiyigedashuaibi";
        byte[] bytes1 = str1.getBytes();

        //写入文件
        fos.write(bytes1);


        //进行换行操作
        String str2="\r\n";
        byte[] bytes2 = str2.getBytes();
        //换行符写入文件
        fos.write(bytes2);


        //换行后再写入数组的部分内容
        fos.write(bytes1,1,4);

        //关闭文件流
        fos.close();


    }
}
