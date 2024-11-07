package 常用的API.objectDemo;


import org.w3c.dom.ls.LSOutput;

public class ObjectDemo{
    public static void main(String[] args) {
        //tostring
        //1.返回对象字符串表现形式
        Object obj=new Object();
        String str1=obj.toString();
        System.out.println(str1);

        Student stu=new Student("张三",23);
        Student stu2=new Student("张三",23);
        String str2=stu.toString();
        System.out.println(str2);   //获取类名+地址

        //核心逻辑:打印对象的时候，它回去调用println,而其实现的是tostring，把它变为字符串，
        //然后在将其打印在控制台
        //所以说打印对象和打印tosting一样打印的是地址值
        System.out.println(stu);

        //equals
       boolean result1= str1.equals(str2);
        System.out.println(result1);

        StringBuilder sb=new StringBuilder("abc");
        String s=new String("abc");
        System.out.println(s.equals("abc"));
    }


}
