package myprintstream;

import java.io.PrintStream;
import java.sql.SQLOutput;

public class PrintStreamDemo3 {

    /*
    *
    *
    *       打印流的应用场景
    *
    * */

    public static void main(String[] args) {
        //这里的out实际上是Java自己给你创建的指向控制台的打印流
//        System.out.println("123");

        //特殊的打印流，系统当中的标准输出流，不能关闭，在系统当中是唯一的，如果说关闭了sout就失效了
        PrintStream ps = System.out;

        ps.println("666");

       // ps.close();

        ps.print("54994");
    }




}
