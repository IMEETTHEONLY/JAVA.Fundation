package myiotest1;

import cn.hutool.core.io.FileUtil;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {

        /*
        *
        *       有一个文件里面存储了班级同学的信息，每一个信息占一行。
        *       格式为:张三-男-23
        *       要求通过程序实现随机点名器
        *
        * */

        //1.定义一个字符串集合来装从文件里面读取的数据
        ArrayList<String> list=new ArrayList<>();

        //2.从文件当中读取数据
        //这里只能写绝对路径，
        FileUtil.readLines("D:\\java基础代码\\java_fundation\\myiotest\\name.txt","UTF-8",list);
        System.out.println(list);

        //3.用collection的shuffle函数打乱顺序实现随机
        Collections.shuffle(list);

        //取出第一个元素，实现随机
        String s = list.get(0);
        //System.out.println(s);

        //然后再分割字符串获取到名字
        String[] name = s.split("-");

        System.out.println(name[0]);

    }
}
