package 常用的API.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
//键盘录入数据加入集合当中，当集合数据到100时为止
    public static void main(String[] args) {
        //键盘录入
        Scanner sc=new Scanner(System.in);

        //创建一个集合来增加整数
        ArrayList<Integer> list=new ArrayList<>();

        while (true){
            System.out.println("请输入一个整数:");
            //键盘录入的统一方式
            String numStr=sc.nextLine();
            int num=Integer.parseInt(numStr);
            if(num<1||num>100){
                System.out.println("输入的数据不在0-100,请重新输入:");
                continue;
            }
                //在添加数据的时候触发了自动装箱  valueof（int）
                list.add(num);

            //统计集合所有数据和
            int sum=getSum(list);
            if(sum>200){
                System.out.println("集合的数据已经满足要求");
                break;
            }

        }

        //验证结论
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);   //细节:自动拆箱
        }
        return sum;
    }


}
