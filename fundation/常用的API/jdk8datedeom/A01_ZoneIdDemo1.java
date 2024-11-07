package 常用的API.jdk8datedeom;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIdDemo1 {


    public static void main(String[] args) {
        //获取所有时区的名称,它划分时区的方式是根据洲/城市
        Set<String> zoneIds= ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);


        //获取当前系统的默认时区
        ZoneId zoneId=ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定的时区
      ZoneId zoneId1=  ZoneId.of("Asia/Aqtau");
        System.out.println(zoneId1);

    }
}
