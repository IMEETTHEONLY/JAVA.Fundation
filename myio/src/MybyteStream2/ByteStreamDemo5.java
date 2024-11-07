package MybyteStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {

        /*
        *
        *   public int read(byte[] buffer)
        *   一次读取一个字节数组的数据:
        *   细节:根据byte数组的长度进行填满读取，
        * 然后返回当前数组的长度(因为如果说剩余长度小于数组长度就会根据当前剩余长度返回),
        * 每次迭代器指针移动数组长度次,如果说迭代器读取完毕返回-1(即数组的长度)
        *
        * */

        //1.创建对象
        FileInputStream fis=new FileInputStream("myio\\a.txt");

        //开始一个数组一个数组的拷贝
        byte[] bytes=new byte[2];  //每次读取的数据都放到这个数组当中



            int len1 = fis.read(bytes);//每次读取的长度..
            //打印每次读出来的数据
            System.out.println(len1);
            System.out.println(new String(bytes,0, len1));

        int len2 = fis.read(bytes);//每次读取的长度..
        //打印每次读出来的数据
        System.out.println(len2);
        System.out.println(new String(bytes,0, len2));


        int len3 = fis.read(bytes);//每次读取的长度..
        //打印每次读出来的数据
        System.out.println(len3);
        System.out.println(new String(bytes,0, len3));

        //这次读取就已经到末尾了，所以说就返沪-1，数组里面的值不会覆盖
        int len4 = fis.read(bytes);//每次读取的长度..
        //打印每次读出来的数据
        System.out.println(len4);
        System.out.println(new String(bytes));



        }





}
