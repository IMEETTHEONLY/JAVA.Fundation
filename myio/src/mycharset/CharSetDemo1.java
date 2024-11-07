package mycharset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {


    public static void main(String[] args) throws UnsupportedEncodingException {

        /*
        *       在java当中编码的方式:
        *       public byte[] getBytes()
        *       public byte[] getBytes(String charsetName)   //有参构造，表示指定方式编码
        *
        *       解码:
        *       String(byte[] bytes)   默认方式解码
        *       String(byte[] bytes,String charsetName)   //指定方式解码
        * */


        String str="万清ai罗怀莉";

        //使用空参进行编码(idea默认是utf-8)
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        //使用指定方式编码
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));


        //解码  要和你编码的方式一样否则就会出现乱码
       String str2= new String(bytes1);  //默认utf-8解码
        System.out.println(str2);

        //采用gbk去解码utf-8编码方式   产生乱码
        String str3=new String(bytes1,"GBK");
        System.out.println(str3);

    }
}
