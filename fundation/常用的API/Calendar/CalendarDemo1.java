package 常用的API.Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {

    public static void main(String[] args) {
        //细节1：获取日历对象,Calendar是一个抽象类不能直接获取，而是通过一个静态方法获取
        //会根据系统的不同时区来获取不同的日历对象
        //会把时间中的年月日时分秒都放到一个数组当中,统一放置,默认当前时间。
        //细节：范围0-11  如果说获取出来的是0，那么实际上是1
        //星期：星期一代表星期天，后面一次类推。
      Calendar c=  Calendar.getInstance();
      //System.out.println(c);

      //修改日历代表的时间
        Date d=new Date(0L);
        c.setTime(d);
        System.out.println(c);

//      修改某个日期中的值
        c.set(Calendar.YEAR,2000);

        //增加某个字段的值
      c.add(Calendar.MONTH,-1);


        //获取日期中某个字段信息
//        0-16索引分别代表时间的某个值


        //java在calendar当中把数字定义为了常量
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int date=c.get(Calendar.DAY_OF_MONTH);
        int week=c.get(Calendar.DAY_OF_WEEK);

        System.out.println(year+","+month+","+date+","+getWeek(week));   //1970年1月1日



    }


    //传入对应的数字
  //返回对应的星期
  public static String getWeek(int  index){

      //定义一个数组，让汉字星期几跟1-7对应
      String[] arr={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};

      //根据索引返回对应的星期
      return arr[index];

  }

}
