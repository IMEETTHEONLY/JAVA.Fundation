package myiotest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {

    /*
    *
    *  文件的用户格式为:username=zhangsan&password=123
    *   从文件当中读取出来，让用户输入用户名和密码与读取出来的用户名和密码进行比对，正确就是显示登录成功
    *
    * */
    public static void main(String[] args) throws IOException {
        //先将内容从文件当中读取出来
        BufferedReader br=new BufferedReader(new FileReader("java_fundation\\myiotest\\src\\myiotest2\\userinfo.txt"));
        String str = br.readLine();
        //System.out.println(str);

        //将字符串分割并提取出用户名和密码
        String[] split = str.split("&");

        //将带=号的数据提取出来
        String allUsername=split[0];
        String allPasswrod=split[1];
        //System.out.println(allUsername);

        //再将用户名和密码读取出来
        String username=allUsername.split("=")[1];
        String password=allPasswrod.split("=")[1];

        //System.out.println(username);

        //让用户输入用户名和密码
        String name;
        String pws;

        Scanner sc=new Scanner(System.in);
        //请输入用户名
        System.out.println("请输入用户名:");
        name= sc.nextLine();
        //请输入密码
        System.out.println("请输入密码:");
        pws=sc.nextLine();

        //System.out.println(name);

        //判断名字和输入的名字是否相同
        if(password.equals(pws)&&name.equals(username)){
            System.out.println("登录成功");
        }
        else {
            System.out.println("登录失败");
        }


    }
}
