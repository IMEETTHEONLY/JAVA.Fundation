package 常用的API;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //运行cmd命令
        //在t时间后关机,单位为秒
//       Runtime.getRuntime().exec("shutdown -s -t 18000");
       //取消关机
       Runtime.getRuntime().exec("shutdown -a");
    }
}
