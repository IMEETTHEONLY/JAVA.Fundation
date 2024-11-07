package MybyteStream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {

    public static void main(String[] args) throws IOException {


        /*
        *       循环输出流:利用迭代器原理，看读出来的数据是否是-1来判断是否结束。
        *          细节:不需要担心文件里面是否存在-1，导致提前结束，因为如果说文件里面的是-1，那么返回出来的就是-号和1.
        *
        * */

        //创建输入流对象
        FileInputStream fis=new FileInputStream("myio\\c.txt");

        //循环读取,直到遇见-1
        int b;  //用来接收获取到的数据
        //细节:这里的read必须用一个整型来接受，因为调用一次read他就会往后移动一次，所以说只能调用一次然后保存下来，再去使用
        while ((b=fis.read())!=-1){
            System.out.print((char) b);


        }

        //关闭流
        fis.close();
    }
}
