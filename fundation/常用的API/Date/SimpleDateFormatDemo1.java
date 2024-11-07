package 常用的API.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {

    public static void main(String[] args) throws ParseException {


        //SimpleDateFormat的使用方法



        //解析Date,将字符串变为Date对象
        //定义一个字符串表示时间
        String str="2023-11-11 11:11:11";
        //利用空参构造创建SimpleDateFormat对象，格式要和字符串一样
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        //打印结果
        System.out.println(date.getTime());

        System.out.println("----------------------");


        //小练习1
        String str2="2000-11-11";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
        //解析为date对象
        Date date2=sdf2.parse(str2);
        //用format格式化这个date对象
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy年MM月dd日");
       String str3= sdf3.format(date2);
        System.out.println(str3);

        System.out.println("-----------------");



        //小练习2:是否成功的参与秒杀活动
        //1.获取结束时间减去开始时间的毫秒值作为判断限制
        SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //解析两个时间
        Date date3=sdf4.parse("2023年11月11日 0:0:0");  //开始时间
        Date date4=sdf4.parse("2023年11月11日 0:10:0");
        //获取在这个区间范围的时间即为秒杀时间
        Long limitTime=date4.getTime()-date3.getTime();
        //System.out.println(limitTime);


        //判断小贾下单时间-开始时间是否小于限制时间
        Date date5=sdf4.parse("2023年11月11日 0:11:0");
        Long time1=date5.getTime()-date3.getTime();
        if(time1<=limitTime){
            System.out.println("恭喜你！秒杀成功");
        }else {
            System.out.println("秒杀时间过了，期待下一次相遇");
        }
    }

    //Date的使用方法
    private static void methed() {
        //格式实现过程
        //利用空参构造创建SimpleDateFormat对象，默认格式  将date转换为需要格式的字符串
        SimpleDateFormat sdf=new SimpleDateFormat();

        Date d=new Date(0L);
        String str= sdf.format(d);
        System.out.println(str);

        //利用带参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str2=sdf2.format(d);
        System.out.println(str2);


        //yyyy年MM月dd日 时:分:秒 星期:E
    }

}
