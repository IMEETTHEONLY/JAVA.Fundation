package 常见算法.Sort_Code;

import java.util.Random;

//快速排序的实现过程
public class A04_quickDemo3 {

    public static void main(String[] args) {
//        int[] arr={6,1,2,7,9,3,4,5,10,8};

        int[] arr=new int[10000];

        Random r=new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }

        long start=System.currentTimeMillis();

        quickSort(arr,0,arr.length-1);

        long end=System.currentTimeMillis();
        System.out.println(end-start);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

    }
    /*
    * 参数一:要排序的数组
    * 参数二:排序数组的起始索引
    * 参数三:排序数组的结束索引
    * */
    public static void quickSort(int[] arr,int i,int j){
        //定义两个变量记录查找的范围
        int start=i;
        int end=j;

        //递归出口
        if(start>end){
            return;
        }



        //记录基准数
        int baseNumber=arr[i];

        //利用循环找到要交换的数字
        while(start!=end){
            //让end从后往前找比基准数小的数字
            while(true){
                if(end<=start||arr[end]<baseNumber){
                    break;
                }
                end--;  //继续寻找
            }
            //让start从前往后找比基准数大的数字
            while(true){
                if(end<=start||arr[start]>baseNumber){
                    break;
                }
                start++;
            }

            //把end和start的元素交换
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;


        }
        //当start和end指向同一位置就结束循环，并进行基准数归位，表示基准数已经找到了该存入数组的位置
        //让基准数和与交点元素交换
        int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp;


        //确定6左边的范围，重复去寻找基准数的位置
        quickSort(arr,i,start-1);

        //右边
        quickSort(arr,start+1,j);
    }

}
