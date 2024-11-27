package myiotest2;

import java.io.*;
import java.util.Scanner;

public class Test02 {

    /*
    *
    *  从文间当中读取出来用户名和密码还有次数，连续输错三次被锁定。
    *
    * */

    public static void main(String[] args) throws IOException {
        //先将内容从文件当中读取出来
        BufferedReader br=new BufferedReader(new FileReader("java_fundation\\myiotest\\src\\myiotest2\\userinfo2.txt"));

        String str = br.readLine();
        //关闭流
        br.close();
        //System.out.println(str);

        //将字符串分割并提取出用户名和密码
        String[] split = str.split("&");

        //将带=号的数据提取出来
        String allUsername=split[0];
        String allPasswrod=split[1];

        //分割得到count即次数
        //System.out.println(allUsername);
        String allCount=split[2];
        //再将用户名和密码和count读取出来
        String username=allUsername.split("=")[1];
        String password=allPasswrod.split("=")[1];
        int count=Integer.parseInt(allCount.split("=")[1]);

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
        if(password.equals(pws)&&name.equals(username)&&count<3){
            System.out.println("登录成功");
            //然后将文件的内容的count更新为0
            writeinfo("username"+"="+username+"&"+"password"+"="+password+"&count=0");
        }
        else {
            //让count++,然后将数据写入到文件里面去
            if(count<3){
                System.out.println("登录失败");
                System.out.println("还剩"+(3-count)+"此机会");
                count++;   //count++后写入文件
                writeinfo("username"+"="+username+"&"+"password"+"="+password+"&count="+count);
            }
            else {
                count++;
                writeinfo("username"+"="+username+"&"+"password"+"="+password+"&count="+count);
                System.out.println("账户已锁定");
            }
        }


    }

    public static void writeinfo(String date) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("java_fundation\\myiotest\\src\\myiotest2\\userinfo2.txt"));
        bw.write(date);
        bw.close();



    }
}
