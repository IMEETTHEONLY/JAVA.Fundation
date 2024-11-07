package 常用的API;

public class 正则表达式的分组 {
    public static void main(String[] args) {

        //判断一个字符串的开始和结束字符是否一致，只考虑一个字符  a123a b456b
        // \\组号:表示把X组的内容再现出现
        String regex1="(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b123b".matches(regex1));
        System.out.println("&123&".matches(regex1));
        System.out.println("a123b".matches(regex1));


        System.out.println("---------------------");

        //判断一个字符串的开始和结束字符是否一致，考虑多个字符  .的意思是任意字符
        String regex2="(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("bb456ba".matches(regex2));


        System.out.println("---------------------");


        //判断一个字符串的开始部分和结束部分是否一致，开始部分内部每个字符也需要一致
        //举例:aaa123aaa bbb456bbb
        //   \\2是指分组括号的下标位置，从左往右数（并且复制内容）
        String regex3="((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("bbb456bba".matches(regex3));



        /*
        需求:将字符串：我要学学编编编编程程程程
        替换为：我要学编程
        */
        //学学  学
        //编编编编 编
        //程程程程 程


        String str="我要学学编编编编程程程程";
       String result= str.replaceAll("(.)\\1+","$1");  //把正则表达式中的第一组拿过来
        System.out.println(result);





        //非捕获分组
        /*身份证号码:
         * 510521200308100178
         * 510521200309100178
         * 510526200308100178
         *
         *
         * */
        //不占用括号分组的位置,找不到\\1
        String regex4="[1-9]\\d{16}(?:\\d|X|x)\\1";
        System.out.println("510521200308100178".matches(regex4));
    }



}
