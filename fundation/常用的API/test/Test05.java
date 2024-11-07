package 常用的API.test;

import java.time.LocalDate;
import java.util.Calendar;

//判断任意一个年份是闰年还是平年
public class Test05 {

    public static void main(String[] args) {
        //jdk7
        //设置为3月1日
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);
        //再减一天看是28号还是29号，29号就是闰年
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //设置为2001年1月1日,再得到是一年的第几天
        Calendar c2=Calendar.getInstance();
        c2.set(2001,0,1);  //月份是0-11
        c2.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(c2);
        int day2=c2.get(Calendar.DAY_OF_YEAR);
        System.out.println(day2);


//        jdk8:月份范围正常   设定时间为2000年3月一日
         LocalDate ld=  LocalDate.of(2000,3,1);
        LocalDate ld2= ld.minusDays(1);  //减一天
        System.out.println(ld2);


        //jdk8写了是否是闰年
        System.out.println( ld.isLeapYear());

    }





}
