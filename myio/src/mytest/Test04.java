package mytest;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test04 {

    public static void main(String[] args) throws IOException {

        /*
        *
        *       把出师表的文章顺序恢复到一个新文件中
        *
        *
        * */

        //利用字符缓冲流一行一行的读取数据
        //用list集合装取出来的数据
        ArrayList<String> list=new ArrayList<>();

        //开始读取数据
        BufferedReader br=new BufferedReader(new FileReader("myio\\csb.txt"));

        String str;
        while ((str= br.readLine())!=null){
            //将读取出来的数据放到集合当中
            list.add(str);
        }
        //关闭流
        br.close();
        //打印看看
        //list.forEach( s-> System.out.println(s));

        //排序




//        方法一:
//        利用steam流给list数组排序
//        字符串比较规则：从第一个字符开始从后逐次比较
        List<String> collect = list.stream().sorted().collect(Collectors.toList());


        //方法二:利用collections.sort排序
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int i1=Integer.parseInt(o1.split("\\.")[0]);
//                int i2=Integer.parseInt(o2.split("\\.")[0]);
//                return i1-i2;
//            }
//        });





        //System.out.println(list);

        //sorted.forEach( s-> System.out.println(s));



        //向新文件当中写入数组
        BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\newcsb.txt"));

        //最后不写入回车换行，所以说最后一个分开写
        for (int i = 0; i < collect.size()-1; i++) {
            bw.write(collect.get(i));
            //换行
            bw.newLine();
        }

        //写入最后一条
        bw.write(collect.get(collect.size()-1));

        //关闭流
        bw.close();
    }


}
