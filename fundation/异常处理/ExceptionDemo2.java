package 异常处理;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        //使用try...catch自己捕获

        //格式:
        /*
        *       try{
        *           可能出异常的代码
        *   }catch(异常类名 变量名){
        *           异常代码的处理
        * }
        *
        *
        *
        * */

        int arr[]={1,2,3,4,5,6,7};

        try {
            //这里是可能会出现异常的代码
            System.out.println(arr[10]);    //这里的逻辑是程序会在底层 new 一个ArrayIndexOutOfBoundsException()
                                            //然后拿着这个对象和括号当中的e对象比较，看是否能够接收(是不是相等的类)
                                            //如果说能够接收就执行catch里面的代码
                                            //然后继续执行try catch后面的代码
        }catch (ArrayIndexOutOfBoundsException e){
            //这里如果说捕获到了相应的异常进行的处理
            System.out.println("捕获到了异常");
        }


        System.out.println("我是try catch后面打印的代码");
    }
}
