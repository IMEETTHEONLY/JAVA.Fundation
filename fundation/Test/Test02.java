package Test;

import java.util.Arrays;

//不死神兔-斐波那契数列 1 1 2 3 5 8
//求第12个数值
public class Test02 {

    public static void main(String[] args) {


        //解法一:
        //创建一个长度为12的数组
        int[] arr=new int[12];

        //手动给0索引和1索引的数据进行赋值
        arr[0]=1;
        arr[1]=1;

        //利用循环给剩余的数据进行赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }

        //打印数组
        System.out.println(Arrays.toString(arr));

        //解法2
        //递归的方式求解  寻找出口和规则
        /*
        * arr[11]=arr[10]+arr[9]
        * arr[10]=arr[9]+arr[8]
        * arr[9]=arr[8]+arr[7]
        * ...
        *
        * arr[3]=arr[2]+arr[1];
        * arr[2]=arr[0]+arr[1]
        *
        *
        * */

        System.out.println(getNum(12));
    }

    /*number是具体第几个月*/
    public static int getNum(int number){
        //出口
        if(number==1||number==2){
            return 1;
        }

        //规则就是当前月份=前一个月份+前前个月份  获取的方式就根当前一样调用getNum
      return getNum(number-1)+getNum(number-2);


    }
}
