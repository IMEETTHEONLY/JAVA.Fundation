package Test;
//猴子吃桃子:每天吃剩下的一半再多吃一个
//反向递归的经典案例
public class Test03 {
    public static void main(String[] args) {
        //找出口和规则

        /*
        * 第十天 桃子数量:1
        * 第九天 桃子数量:(1+1)*2=4
        * 第八天 桃子数量:(4+1)*2=10
        * 第七天 桃子数量:(10+1)*2=22
        * 第六天 桃子数量:(22+1)*2=46
        *
        *
        * ...
        * 第1天 桃子数量:(第九天数量+1)*2
        * */
        System.out.println(getNum(1));


    }
    //把获取桃子数量的天数传递过来
    public static int getNum(int day){
        //递归出口
        if(day==10){
            return 1;
        }

        //第一天的数量就是第二天的基础上得到
        return (getNum(day+1)+1)*2;

    }
}
