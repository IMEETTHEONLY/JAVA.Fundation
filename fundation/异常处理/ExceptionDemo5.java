package 异常处理;

public class ExceptionDemo5 {

    public static void main(String[] args) {

        //定义在throwable(顶级异常类 包含 error和exception)里面的顶级方法


        int[] arr={1,2,3,4,5,6,7};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //展示错误信息
//            String message = e.getMessage();
//            System.out.println(message);
            //展示异常名+错误信息
//            String string = e.toString();
//            System.out.println(string);

            //综合上面的两个  红色字体展示并且继续正常执行异常后面的代码
            e.printStackTrace();
        }


        System.out.println("看看我执行了吗");
        System.err.println("看看我执行了吗");
    }
}
