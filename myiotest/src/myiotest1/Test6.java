package myiotest1;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Test6 {

    public static void main(String[] args) throws IOException {

        /*
        *       实现要求:被点到的学生不会再被点到
        *       如果说班级当中的学生都点完了，需要自动的开启第二轮点名。
        *
        *       程序运行10次,每一轮学生只能被点一次,程序运行10次,第一轮结束
        *       11次的时候自动开启第二轮点名。
        *
        *
        * */


        //思路:从文件当中读取名字，然后读取一次删除一次，再加入新文件，当读取出来的老文件为空的时候，就把新文件的内容复制到老文件

        //从文件当中去读取出一个名字然后文件不为空就读取出来然后打印，再把这个名字复制到新文件当中，从老文件删除这个名字

        //定义一个字符串集合来存储名字
        ArrayList<String> list=new ArrayList<>() ;

        //利用buffReader的特有方法读取文件
        BufferedReader br = new BufferedReader(new FileReader("java_fundation\\myiotest\\src\\MyFile\\file1"));

        //开始读取文件
        String s;

        while((s = br.readLine())!=null){
            list.add(s);
        }
        br.close();

        System.out.println(list);
        //如果说文件已经没有名字了，那么就把新文件的内容复制到老文件
        if(list.isEmpty()){
            BufferedReader br2=new BufferedReader(new FileReader("java_fundation\\myiotest\\src\\MyFile\\file2"));
            BufferedWriter br5=new BufferedWriter(new FileWriter("java_fundation\\myiotest\\src\\MyFile\\file1"));

            //从br2里面读取一行加入br5
            String s1;
            while ((s1=br2.readLine())!=null){
                br5.write(s1);
                //换行
                br5.newLine();
            }
            //关闭流
            br5.close();
            br2.close();

            //这里返回即可，=继续下去就是操作空集合了
            return;

        }

        //随机点名然后将将这个名字从老文件删除，再加入新文件
        Random r=new Random();
        //产生随机索引
        int index=r.nextInt(list.size());
        //获取名字并打印
        String date=list.get(index);
        System.out.println(date);

        //将这个名字从老文件删除
        list.remove(index);

        //删除后将list集合重新写入老文件
          BufferedWriter br4=new BufferedWriter(new FileWriter("java_fundation\\myiotest\\src\\MyFile\\file1"));
        for (String string : list) {
            //写入文件,以清空老文件的方式
            br4.write(string);
            //换行
            br4.newLine();
        }
        //关闭流
        br4.close();

        //将这个名字加入新文件
        BufferedWriter br3=new BufferedWriter(new FileWriter("java_fundation\\myiotest\\src\\MyFile\\file2",true));

        br3.write(date);
        //加入之后换行
        br3.newLine();;
        //关闭流
        br3.close();
       // System.out.println(list);
    }
}
