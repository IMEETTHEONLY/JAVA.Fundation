package Test;
//小明爬楼梯
public class Test04 {
    public static void main(String[] args) {
        /*
        * 第一层:1种爬法
        * 第二层:11 2。2种
        * 第三层:111 21 12。3种
        * 第四层:1111 211 121 22 112。5种
        * 第五层:11111 1112 1121 122 1211 221 2111 212
        * ....
        *
        * 斐波那契数列 从第三层开始
        * */

        System.out.println(getNum(20));

       }

       public static int getNum(int floor){
        //递归出口:它是从第三层开始递归的，所以说前两层直接返回
        if(floor==1){
            return 1;
        }

        if(floor==2){
            return 2;
        }



        return getNum(floor-1)+getNum(floor-2);


       }

}
