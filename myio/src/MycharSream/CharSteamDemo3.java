package MycharSream;

import java.io.FileWriter;
import java.io.IOException;

public class CharSteamDemo3
{
    public static void main(String[] args) throws IOException {

        /*
        *    字符输出流的五种成员方法的第一次使用
        *
        *
        * */

        //创建对象                                           //续写开关
        FileWriter fw=new FileWriter("myio\\e.txt",true);

        //向文件当中写入一个数据
        fw.write(25001);   //将十进制转换为二进制，
                                // 然后再根据默认的编码utf-8进行编码写入文件

        //写入字符串
        fw.write("哈哈哈我写入字符串了");

        //写入字符串的一部分
        fw.write("哈哈哈我写入字符串了",2,5);

        //写入字符数组
        char[] chars={'b','b','我','w'};

        fw.write(chars);
        //关闭字符流
        fw.close();
    }


}
