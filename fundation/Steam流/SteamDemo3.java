package Steam流;

import java.util.Arrays;

public class SteamDemo3 {
    public static void main(String[] args) {
        //数组调用steam方法

        //创建数组  什么类型的数组都可以
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        //获取steam流
        Arrays.stream(arr).forEach(s -> System.out.println(s));
    }
}
