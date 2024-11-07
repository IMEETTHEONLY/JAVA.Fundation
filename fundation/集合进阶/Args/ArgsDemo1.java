package 集合进阶.Args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        //计算n个数据的和
        //JDK5
        //可变参数:方法形参个数是可以发生变化的.0,1,2,3...
        //格式：属性类型...名字
        //int...args

        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
    }

    //其实可变参数的底层就是集合，它可以接收任意长度的数据然后存入集合
    public static int getSum(int... args){
        //System.out.println(args);
        int sum=0;
        for (int arg : args) {
            sum+=arg;
        }
        return sum;
    }
}
