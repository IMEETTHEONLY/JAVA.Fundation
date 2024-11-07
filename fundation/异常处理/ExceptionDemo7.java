package 异常处理;

import java.util.Scanner;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        //异常综合练习
        /*
        *       键盘录入女朋友的姓名和年龄
        *       姓名长度在3-10
        *       年龄范围为18-40
        *       超过这个范围是异常数据，需要重新录入
        * */

        Girl girl= new Girl();
       while (true){

           try {
               Scanner sc=new Scanner(System.in);
               //创建女朋友对象
               girl = new Girl();
               System.out.println("请录入女朋友的姓名:");
               String name=sc.nextLine();
               girl.setName(name);
               System.out.println("请输入女朋友的年龄:");
               String ageStr=sc.nextLine();
               girl.setAge(Integer.parseInt(ageStr));
               break;
           } catch (NumberFormatException e) {
               System.out.println("年龄的格式有误");
           }

           //Runtime要写在下面,NumberFormatException是runtime的子类，它是parseInt可能的异常
           catch (NameFormatException e) {
               e.printStackTrace();
           }

           catch (AgeOutBoundsException e) {
               e.printStackTrace();
           }
       }
        System.out.println(girl);
    }
}
