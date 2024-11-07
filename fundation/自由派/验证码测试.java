package 自由派;

import java.util.ArrayList;
import java.util.Random;

public class 验证码测试 {
    public static void main(String[] args) {
        ArrayList<Character> list=new ArrayList<>();  //用来保存a-z和，A-Z
        for(int i=0;i<26;i++){
            list.add((char) ('a'+i));   //a-z
            list.add((char) ('A'+i));  //A-Z
        }

        System.out.println(list);

        //接下来随机获取集合里面的4个字母
        String result = "";

        Random r=new Random();

        for(int i=0;i<4;i++){
            //生成随机的index
            int index = r.nextInt(list.size());
            //获取随机的字母
            result=result+list.get(index);

        }


        //在验证码的第五位上加入随机数字

        //生成0-9的随机数字
        int number= r.nextInt(10);
        result+=number;

        //将字符串转换为字符数组，然后再将数字随机和某一下标交换
        char[] charArray = result.toCharArray();
        int charIndex=r.nextInt(charArray.length);
        char tem=charArray[charIndex];
        charArray[charIndex]=charArray[4];
        charArray[4]=tem;


       String code=new String(charArray);
        System.out.println(code);


    }
}
