package 自由派;

public class MyStringBuilder {
    public static void main(String[] args) {

        //他们的区别仅仅在于是否线程安全0
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());

        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
    }
}
