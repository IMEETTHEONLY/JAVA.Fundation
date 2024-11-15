package myiotest1;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test5 {

    public static void main(String[] args) {

        /*
        *
        *   实现第三次抽到的一定是于圣玮,其他都是随机抽取
        *
        * */

        //设计计数器，判断是第三次就打印于圣玮，其他的就是随机抽取

        int count;   //计数器
        //使用hutool包的读取数据的方法,要使用绝对地址
        List<String> list = FileUtil.readLines("D:\\java_code\\java_fundation\\myiotest\\name.txt","UTF-8",new ArrayList<>());
        //System.out.println(list);

        //获取count的值

        //获取最后一行数据
        String s = list.get(list.size() - 1);
        System.out.println(s);
        //获取count的值  因为是count=**
        String scount = s.split("=")[1];

        //转化为整数后赋值给count即可
        count=Integer.valueOf(scount);

        //根据计数器的值来判断当前是随机抽取还是作弊抽取
        if(count==3){
            System.out.println("于圣玮");


        }
        else {
            //这里不能打乱集合，否则count的位置就不对了!!!切记  因为每次都是删除最后一个元素
            Random r=new Random();
            int index= r.nextInt(list.size()-1);
            String date=list.get(index);

            //获取名字
            String string = date.split("-")[0];
            System.out.println(string);


        }

        //将集合最后一行的值改变
        String remove = list.remove(list.size() - 1);

        count++;
        String newCount="count="+count;

        //添加进集合
        list.add(newCount);
        System.out.println(list);

        //写入文件
        FileUtil.writeLines(list,new File("D:\\java_code\\java_fundation\\myiotest\\name.txt"),"UTF-8");

    }
}
