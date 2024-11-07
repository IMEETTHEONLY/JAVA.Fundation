package 常用的API.jdk8datedeom;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A01_InstantDemo {

    public static void main(String[] args) {
        //1.获取当前时间的instant对象（标准时间）
        Instant now = Instant.now();
        System.out.println(now);


        //2.根据(毫秒值/秒)获取instant对象,相当于时间原点
        Instant instant = Instant.ofEpochMilli(0L);
        System.out.println(instant);
        //秒钟
        Instant instant1 = Instant.ofEpochSecond(1L);
        System.out.println(instant1);

        //秒+纳秒  结果是他们的和
        Instant instant2 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant2);

        //3.指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Aqtau"));
        System.out.println(zonedDateTime);

        //4.is  判断  判断两个时间的先后顺序
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);

        boolean before = instant3.isBefore(instant4);
        System.out.println(before);


        //减少时间系列
        Instant instant5 = Instant.ofEpochMilli(3000L);
        System.out.println(instant5);

        Instant instant6 = instant5.minusSeconds(1);
        System.out.println(instant6);
    }



}
