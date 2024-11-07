package mytest;

import java.io.*;

public class Test05 {
    public static void main(String[] args) throws IOException {
        /*
        *
        *       实现一个验证程序运行次数的小程序,要求如下:
        *      2.程序运行演示如下:
        *         第一次运行控制台输出:欢迎使用本软件，第1次免费使用~
        *         第二次运行控制台输出:欢迎使用本软件，第2次免费使用~
        *         第三次运行控制台输出:欢迎使用本软件，第3次免费使用~
        *          第四次及以后输出:本软件只能免费使用三次，欢迎您注册会员后使用
        *
        *           //细节；在使用输入/输出流的时候，一定要随用随关，否则很可能出现你一起new了，然后write把它清空了。
        * */

        //我的基本思路就是创建一个文件，然后初始一个整数为0，然后每调用一次，从文件当中取出++，再放回

        //读写纯文本文件，其实都差不多，但是个人偏好带缓冲的
        BufferedReader br=new BufferedReader(new FileReader("myio\\record.txt"));

        //将字符串形式的次数读取到本地当中
        String string = br.readLine();
        int read=Integer.parseInt(string);


        switch (read){

            case 0:
                System.out.println("欢迎使用本软件，第1次免费使用~");
                break;
            case 1:
                System.out.println("欢迎使用本软件，第2次免费使用~");
                break;

            case 2:
                System.out.println("欢迎使用本软件，第3次免费使用~");
                break;
            default:
                System.out.println("本软件只能免费使用三次，欢迎您注册会员后使用");

        };

        //再把read++加入文件当中
        read++;
        System.out.println(read);

        //开启写入流
        BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\record.txt"));
        //将次数写入文件,写入的字符形式的数据   清空写入即可
        bw.write(read+48);

        //关闭流
        bw.close();

    }





}
