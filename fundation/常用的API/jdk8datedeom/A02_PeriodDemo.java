package 常用的API.jdk8datedeom;

import java.time.LocalDate;
import java.time.Period;

public class A02_PeriodDemo {

    public static void main(String[] args) {

        //当前
        LocalDate today=LocalDate.now();

        //生日的年月日
        LocalDate birthDay = LocalDate.of(2003, 8, 10);

        Period between = Period.between(birthDay, today);  //第二个参数减第一个参数
        System.out.println(between);
        System.out.println(between.getYears());

    }
}
