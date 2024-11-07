package 异常处理;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //探究异常的第二个作用   --作为返回值


        //学生的年龄只能在18-40，如果说不在这个范围内就抛出异常(抛出了异常这样就可以让程序员去知道代码底层执行如何并且可以处理异常发生时的逻辑)
        Student s=new Student();
        s.setAge(65);

    }
}
