package 常用的API.Date;

import java.util.Date;
import java.util.Random;

public class jdkdatedemo {
    public static void main(String[] args) {
        //Date对象是从时间原点开始计算的


        //创建对象表示一个时间
        Date d=new Date();
        System.out.println(d);


        //创建对象表示一个指定的时间,并且指定从原点开始到现在过了多长时间
        Date d2=new Date(0L);
        System.out.println(d2);

        //setTime修改时间
        d2.setTime(1000L);
        System.out.println(d2);

        //getTime获取当前时间毫秒值
        long time=d2.getTime();
        System.out.println(time);


        System.out.println("---------------");

        //打印时间原点一年后的时间
        Date d1=new Date(0L);
        //获取d1的毫秒值
        Long time1=d1.getTime();
        //在此基础上加一年的毫秒值
        time1=time1+1000L*60*60*24*365;
        d1.setTime(time1);
        System.out.println(d1);


        System.out.println("---------------");
        //任意定义两个Date对象，比较哪个的时间在前
        Random r=new Random();

        //创建两个时间对象
        Date d3=new Date(Math.abs(r.nextInt()));
        Date d4=new Date(Math.abs(r.nextInt()));
        System.out.println(d3);
        System.out.println(d4);

        if(d3.getTime()>d4.getTime()){
            System.out.println("d3在前");
        }else if(d3.getTime()<d4.getTime()){
            System.out.println("d4在前");
        }
        else{
            System.out.println("时间一样");
        }

    }




}
