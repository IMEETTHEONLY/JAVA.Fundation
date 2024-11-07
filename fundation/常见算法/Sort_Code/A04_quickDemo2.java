package 常见算法.Sort_Code;
//递归求阶乘
public class A04_quickDemo2 {

    public static void main(String[] args) {
        //分为小步骤
        /*
        * 5的阶乘=5*(1-4之间的阶乘)
        * 4的阶乘=4*(1-3之间的阶乘)
        * .....
        * 2的阶乘=2*(1-1之间的阶乘)
        * 1的阶乘=1（递归的出口）
        *
        *
        * */
        int reuslt=mutiple(5);
        System.out.println(reuslt);

    }


    public static int mutiple(int number){
        if(number==1){
            return 1;
        }

        return number*mutiple(number-1);

    }
}
