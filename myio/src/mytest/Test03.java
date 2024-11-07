package mytest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

public class Test03 {

    /*
    *       将文件当中的2-1-9-4-7-8转换为排序后的数据
    *
    *
    *       细节1:引用在项目以外的文件可能有bom头,就是用来表示文件的
    *       细节2:文件当中的数据不要留下换行  否则会有\r\n也会被读出来
    *
    *       以上两种都会导致，强转为int类型失败
    * */

    //先关联文件，读取纯文本文件  用fileReader
    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("myio\\i.txt");
        //首先要明白:你向文件当中写入数据只有两种方法 写入int和string(参数)  读取的话得到int 或者是数组(返回值)

        //把读出来的字符拼接,不是单纯的打印都要拼接
        StringBuilder sb=new StringBuilder();

        //向文件读取数据
        int b;
        while((b=fr.read())!=-1){
            //向sb加入字符
            sb.append((char) b);
        }

        //关闭流
        fr.close();
        //将sb转换为字符串
        String str = sb.toString();
        //打印
        //System.out.println(str);


        //对数据进行排序  用stream流

        //先将str转换为数组
        String[] strs = str.split("-");
       //System.out.println(Arrays.toString(strs));

        Integer[] array = Arrays.stream(strs).
                map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                }).
                sorted().
                toArray(Integer[]::new);

//        System.out.println(Arrays.toString(array));


        //接下来就是向文件当中写入数据

        //因为read可以传递字符串，所以说将数组转换为相同的格式传递过去即可
        String newStr = Arrays.toString(array).replace(", ", "-");
       // System.out.println(newStr);

        //将前后的中括号去掉
        String reuslt = newStr.substring(1, newStr.length() - 1);
        System.out.println(reuslt);


        //最后将result写入文件即可
        FileWriter fw=new FileWriter("myio\\i.txt");

        fw.write(reuslt);

        //关闭流
        fw.close();


    }

}
