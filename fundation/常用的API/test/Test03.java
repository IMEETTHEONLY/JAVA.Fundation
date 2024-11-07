package 常用的API.test;

import java.util.ArrayList;

//实现十进制转向二进制转换
public class Test03 {
    public static void main(String[] args) {
//        int date=6;  //作为最初的值也作为商
//        //初始化一个容器
//        ArrayList<Integer> list=new ArrayList<>();
//
//        int yushu=0;
//        //采用除基取余法，将余数存入容器中
//        while(date>0){
//            yushu=date%2;
//            date/=2;
//            list.add(yushu);
//        }
//
//        String reuslt=list.toString();
//        System.out.println(reuslt);
        System.out.println(toBinaryString(6));


    }


    public static String toBinaryString(int number){
        //核心逻辑:不断的去除以2，得到余数，一直除到0
        //把余数拼接起来

        StringBuilder sb=new StringBuilder();

        //除2取余数
        while(true){
            if(number==0){
                break;
            }

            //先获取余数
            int remainder=number%2;
//            System.out.println(remainder);

            //倒着拼接到sb当中,insert是插入到某个索引
            sb.insert(0,remainder);
            //再除以2
            number/=2;

        }
        return sb.toString();

    }
}
