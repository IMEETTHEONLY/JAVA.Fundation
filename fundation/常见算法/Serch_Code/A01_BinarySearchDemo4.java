package 常见算法.Serch_Code;
//二分法的进阶----插值查找
public class A01_BinarySearchDemo4 {
    public static void main(String[] args) {
        //二分查找
        int[] arr={7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr,147));

    }


    public static int binarySearch(int[] arr,int number){
        //定义两个变量表示寻找的范围
        int min=0;
        int max=arr.length-1;  //这里只能用闭区间,因为要用索引的值
        //核心就在于middle是否找到了那个元素
        while (min<=max){
            int middle=min+(number-arr[min])/(arr[max]-arr[min])*(max-min);  //核心就在于缩小这个mid的公式:思想就是值的大概范围，然后再去乘索引范围，得到大概索引
            if(number>arr[middle]){
                min=middle+1;  //此时要找到数据在右半边
            }
            if(number<arr[middle]){
                max=middle-1;  //此时要找到数据在左半边
            }
            if(number==arr[middle]){
                return middle;
            }
        }

        return  -1;

    }
}
