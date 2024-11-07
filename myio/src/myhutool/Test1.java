package myhutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        /*
        *
        *       FileUtil类:
        *
        *           file：根据参数创建一个file对象
                    touch：根据参数创建文件
                    writeLines：把集合中的数据写出到文件中，覆盖模式。
                    appendLines：把集合中的数据写出到文件中，续写模式。
                    readLines：指定字符编码，把文件中的数据，读到集合中。
                    readUtf8Lines：按照UTF-8的形式，把文件中的数据，读到集合中
                    copy：拷贝文件或者文件夹
        *
        * */
        //创建file对象
        File file = FileUtil.file("D:\\", "aaa", "bbb", "a.txt");
//        System.out.println(file);
//
//
//        //创建文件（父级路径不存在也会创建出父级路径）
//        File touch = FileUtil.touch(file);
//        System.out.println(touch);
//
//        //把集合中的数据写出到文件中，覆盖模式。
//        ArrayList<String> list=new ArrayList<>();
//        list.add("aaa");
//        list.add("aaaaaa");
//
//        File file1 = FileUtil.writeLines(list, file, "UTF-8");
//        System.out.println(file1);

        List<String> list = FileUtil.readLines(file, "UTF-8");
        System.out.println(list);

    }
}
