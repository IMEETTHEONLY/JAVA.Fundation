package 常用的API.jdk8datedeom;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class A01_CalendarDemo {
    public static void main(String[] args) {
        LocalDate ldDate=LocalDate.now();
        System.out.println(ldDate);


        LocalDate localDate = LocalDate.of(2021, 1, 1);

        //isxxx判断时间先后
        System.out.println(ldDate.isBefore(localDate));

        //with方法修改时间
        LocalDate localDate1=ldDate.withMonth(10);
        System.out.println(localDate1);

        //minxxx
        LocalDate localDate2 = ldDate.minusDays(5);
        System.out.println(localDate2);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
    }

}
