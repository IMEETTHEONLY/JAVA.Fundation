package 常见算法.Sort_Code;

import java.util.Random;

//选择排序的
public class A02_ChooseDemo2 {
    public static void main(String[] args) {


        //1.定义数组
//        int[] arr={2,4,5,3,1};

        //初始化数组
        int[] arr=new int[10000];

        Random r=new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }




        long start=System.currentTimeMillis();


        //2.利用选择排序
        //外层是控制去选择排第几个元素,最后一个元素默认排好
        for (int i = 0; i < arr.length-1; i++) {
            //内层让当前元素和它后面的元素依次比较确定当前位置的元素
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        //计算时间
        long end=System.currentTimeMillis();
        System.out.println(end-start);

//        //遍历数组
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
    }



    }



