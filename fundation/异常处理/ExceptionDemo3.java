package 异常处理;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //灵魂四问之一----try里面的代码没有问题，怎么执行



        int[] arr={1,2,5,6,4};

        try {
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗");


        //解答：
        //此情况下就直接按照原代码逻辑去执行，不会执行catch里面的代码
    }
}
