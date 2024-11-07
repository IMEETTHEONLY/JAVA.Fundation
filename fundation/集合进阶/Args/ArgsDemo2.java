package 集合进阶.Args;

public class ArgsDemo2 {
    public static void main(String[] args) {
        //可变参数的小细节
        //1.一个方法当中只能包含一个可变参数，因为他本身就可以把所有参数吃完

        //2.若除了可变参数以外还有其他参数，其他参数要写在前面
        getSum(5,151551,15,51,5);
    }

    public static int getSum(int a,int... arg){
        return  0;
    }


}
