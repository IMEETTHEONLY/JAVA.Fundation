package 常用的API.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//计算你活了多少天:Date和jdk的新时间类
public class Test04 {
    public static void main(String[] args) throws ParseException {
        //用代码实现你活了多少天，用jdk7和jdk8完成


        //jdk7方式:将时间转换为Date对象，然后取得毫秒值来计算
        //2003 8-10    2024 9-10
        //将两个时间解析为Date对象即可
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        Date d1=sdf.parse("2003-8-10");
        Date d2=sdf.parse("2024-9-10");

        Long t1=d1.getTime();
        Long t2=d2.getTime();
//        System.out.println(t1/1000/60/60/24/365);
        Long result=(t2-t1)/1000/60/60/24;
        System.out.println(result);



        //jdk8方式:
        LocalDate ld1=LocalDate.of(2003,8,10);
        LocalDate ld2=LocalDate.now();

        //调用工具类，计算两个时间差
     Long day=   ChronoUnit.DAYS.between(ld1,ld2);
        System.out.println(day);

    }


}
