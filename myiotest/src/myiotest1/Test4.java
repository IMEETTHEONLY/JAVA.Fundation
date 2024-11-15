package myiotest1;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test4 {

    public static void main(String[] args) throws IOException {

        /*
                有一个文件里面存储了班级同学的信息，每一个信息占一行。
        *       格式为:张三-男-23
        *       要求通过程序实现随机点名器

                70%抽到男生,30%抽到女生
        * */


        //用一个数组来存储概率  1表示男生 0表示女生
        int[] arr= {1,1,1,1,1,1,1,0,0,0};

        //使用随机数方式，随机抽取一个数字  这样就保证了概率
        //产生 15-28的数字
        //28-15->13    13+1=14  括号里面写14
        //由于它是左闭右开，所以说你要让你的范围(bound)+1.在括号外面的是起始数据
        Random r=new Random();
        int index = r.nextInt(arr.length-1);
        System.out.println(index);


        //我要一行一行的读取，这是缓冲流的特点，所以说我要封装为BuffReader，然后我要指定编码的话，是转换流的任务，我也要封装为转换流
        BufferedReader br=new BufferedReader(new FileReader("java_fundation//myiotest//name.txt",Charset.forName("UTF-8")));

        //创建一个String集合来存储读取出来的数据
        ArrayList<String> list=new ArrayList<>();

        //获取随机出来是男生或者是女生的所有数据
        String date;
        while ((date=br.readLine())!=null){
            //根据Index的值从文件当中读取数据

            //将date分割，看性别是男还是女，再根据index的值，判断是否需要加入list
            String[] split = date.split("-");

            //如果说抽到男生，就把男生放进数组
           if(arr[index]==1){
               if(split[1].equals("男")){
                   list.add(date);
               }
           }
           //如果说抽到女生，就把女生放进数组
           else {
               if(split[1].equals("女")){
                   list.add(date);
               }
           }

        }

        //关闭流
        br.close();
       // System.out.println(list);

        //再在list里面随机抽取一个即可
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
