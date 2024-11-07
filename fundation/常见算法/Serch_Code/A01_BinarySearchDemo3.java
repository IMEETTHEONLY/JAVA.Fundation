package 常见算法.Serch_Code;

public class A01_BinarySearchDemo3 {
    public static void main(String[] args) {
        //二分查找
        int[] arr={7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr,127));

    }


    public static int binarySearch(int[] arr,int number){
        //定义两个变量表示寻找的范围
        int min=0;
        int max=arr.length;
        //核心就在于middle是否找到了那个元素
        while (min<max){
            int middle=(min+max)/2;
            if(number>arr[middle]){
                min=middle+1;  //此时要找到数据在右半边
            }
            if(number<arr[middle]){
                max=middle;  //此时要找到数据在左半边
            }
            if(number==arr[middle]){
                return middle;
            }
        }

        return  -1;

    }
}
