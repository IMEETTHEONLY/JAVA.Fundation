package 常见算法.Serch_Code;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //利用基本查询寻找元素在数组当中的索引,多个可重复
        int[] arr={131,1,2,3,5,82,82};
        int number=82;
        System.out.println( basicSearch(arr,82).toString());

    }

    public static ArrayList<Integer> basicSearch(int[] arr,int number){
        //利用基本查找在数组当中是否存在
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                list.add(i);
            }
        }

        return list;
    }
}
