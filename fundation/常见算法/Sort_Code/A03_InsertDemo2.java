package 常见算法.Sort_Code;

import java.util.Random;

//插入排序计算时间
public class A03_InsertDemo2 {
    public static void main(String[] args) {
        //初始化数组
        int[] arr=new int[10000];

        Random r=new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }




        long start=System.currentTimeMillis();


        //1.找到无序的那一组数据是从哪一个索引开始的
        int startIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                startIndex=i+1;
                break;
            }
        }


        //2.遍历从startIndex到最后一个元素，依次得到每一个无序的元素再插入
        for (int i = startIndex; i < arr.length; i++) {
            //记录当前要插入数据的索引
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){

                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                //继续让当前换过的元素与前面的元素继续比较，相当于就是找位置的过程
                j--;
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

