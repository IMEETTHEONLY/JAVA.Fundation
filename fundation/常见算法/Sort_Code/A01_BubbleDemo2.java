package 常见算法.Sort_Code;

import java.util.Random;

//计算时间的冒泡排序算法
public class A01_BubbleDemo2 {
    public static void main(String[] args) {
        //定义数组
//        int[] arr={2,4,5,3,1};


        //初始化数组
        int[] arr=new int[10000];

        Random r=new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }




        long start=System.currentTimeMillis();



        //利用冒泡排序，进行排序（核心代码）
        //外层控制轮数,n个数据比较n-1轮
        for (int i = 0; i < arr.length-1; i++) {
            //可以先写第一轮，结束之后最大值在最右边  一定要-1，否则4+1=5就越界。
            //arr.length-1-i减i是每多一轮就要少比较一个数字，因为该数字已经确定好了位置
            for (int j = 0; j < arr.length-1-i; j++) {
                //i是每一个索引
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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

