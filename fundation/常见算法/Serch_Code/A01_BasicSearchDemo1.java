package 常见算法.Serch_Code;


public class A01_BasicSearchDemo1 {
    //基本查找/顺序查找

    //需求：定义一个方法利用基本查找，查询某个元素是否存在。

    public static void main(String[] args) {

        int[] arr={131,1,2,3,5};
        int number=82;
        System.out.println( basicSearch(arr,82));

    }

    public static boolean basicSearch(int[] arr,int number){
        //利用基本查找在数组当中是否存在
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                return true;
            }
        }

        return false;
    }


}
