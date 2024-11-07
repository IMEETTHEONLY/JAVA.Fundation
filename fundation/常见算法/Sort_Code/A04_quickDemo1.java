package 常见算法.Sort_Code;
//递归求解1-100之和

public class A04_quickDemo1 {

    public static void main(String[] args) {
            //大问题拆成小问题
            /*
            * 1-100的和=100+（1-99之间的和）
            * 1-99的和=99+（1-98之间的和）
            * .....
            * 1-2的和=2+(1-1的和)
            * 1-1的和=1(递归的出口)
            *
            * */

        int result=add(100);
        System.out.println(result);

    }

    public static int add(int number){
        //递归终止条件
        if(number==1){
            return 1;
        }

        //把大问题拆成小问题的一小步
       return number+add(number-1);
    }

}
