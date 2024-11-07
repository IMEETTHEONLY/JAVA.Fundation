package 常用的API.test;
//自己实现parseint方法的效果,将字符串形式数据转换为整数  字符串只能是整数，在1-10位  不能0开头
public class Test02 {
    public static void main(String[] args) {
        //定义一个字符串
        String s1="123456789";

        //校验字符串，先将异常数据过滤
        if(!s1.matches("[1-9]\\d{0,9}")){
            System.out.println("格式有误");
            //错误的数据
        }
        else{
            System.out.println("格式正确");
            //数据格式正确

            //定义变量表示最终的结果
            int num=0;
            for (int i = 0; i < s1.length(); i++) {
                int c=s1.charAt(i)-'0';
                System.out.println(c);
                //放到num
                num=num*10+c;

            }

            System.out.println(num+1);
        }

    }


}
