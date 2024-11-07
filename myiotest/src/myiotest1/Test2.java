package myiotest1;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test2 {

    public static void main(String[] args) {


        /*
        *
        *   利用hutool包的方法来爬取数据
        *
        * */


        /*获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d
        获取男生名字：http://www.haoming8.cn/baobao/10881.html
        获取女生名字：http://www.haoming8.cn/baobao/7641.html
        */

        //1.定义变量记录网址
        String familyName="https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyName="http://www.haoming8.cn/baobao/10881.html";
        String girlName="http://www.haoming8.cn/baobao/7641.html";

        //2.调用hutool包来获取网页的数据
        String familyNameTemStr= HttpUtil.get(familyName);
        String boyNameTemStr= HttpUtil.get(boyName);
        String girlNameTemStr= HttpUtil.get(girlName);



        /*
        *
        *  ArrayList<String> familyNameStrTemList = getDate(familyNameStr, "(\\W{4})(，|。)", 1);
        //System.out.println(familyNameStrTemList);
                                                                    ///^[\u4E00-\u9FA5]+$/表示中文字符
        ArrayList<String> boyNameTemList = getDate(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        //System.out.println(boyNameTemList);
                                                                //..+空格表示是的名字+空格 出现四次，然后最后再出现一个名字，这样就读取到一行  index为0表示获取所有
        ArrayList<String> girlNameTemList = getDate(girlNameStr, "(.. ){4}..", 0);
        *
        *
        * */

        //3.用正则表达式筛选出需要的内容
        List<String> familyNameStrTemList = ReUtil.findAll("(\\W{4})(，|。)", familyNameTemStr, 1);
        //System.out.println(familyNameStrTemList);
        List<String> boyNameTemList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameTemStr, 1);
        //System.out.println(boyNameTemList);
        List<String> girlNameTemList = ReUtil.findAll("(.. ){4}..", girlNameTemStr, 0);
       // System.out.println(girlNameTemList);

        //4.处理数据
        //familyNameStrTemList(姓氏)
        ArrayList<String> familyNameStrList=new ArrayList<>();
        //处理方案:将每组数据里面的每组遍历出来加入List当中
        for (String s : familyNameStrTemList) {
            for (int i = 0; i < s.length(); i++) {
                familyNameStrList.add(s.charAt(i)+"");
            }
        }
        //  System.out.println(familyNameStrList);

        //boyNameTemList（男孩名字）
        //要进行去重操作
        ArrayList<String> boyNameList=new ArrayList<>();
        for (int i = 0; i < boyNameTemList.size(); i++) {
            if(!boyNameList.contains(boyNameTemList.get(i))){
                //如果说当前list当中不存在加入
                boyNameList.add(boyNameTemList.get(i));
            }
        }
        // System.out.println(boyNameList);


        //girlNameTemList(女孩名字)
        //要进行分割操作
        ArrayList<String> girlNameList=new ArrayList<>();
        for (String str : girlNameTemList) {
            String[] split = str.split(" ");
            //遍历split数组加入到list当中
            for (String s : split) {
                girlNameList.add(s);
            }
        }
        // System.out.println(girlNameList);

        //5.生成数据
        //姓名(唯一)-性别-年龄
        ArrayList<String> infos = getInfos(familyNameStrList, boyNameList, girlNameList, 70, 50);
        //打乱集合输出
        Collections.shuffle(infos);
        System.out.println(infos);


        //6.用hutool包里面的方法写道文件当中
        //hutool包的相对路，不是根据当前项目而言的，而是根据class文件    out->production->myiotest->name2.txt
        FileUtil.writeLines(infos,"myiotest\\name2.txt","UTF-8");

    }


    //作用:获取男生和女生的最终信息表达格式:  张三-男-23
    //参数分别表示:形式列表，男生名字列表1，女生名字列表，男生需要的个数，男生需要的个数
    public static  ArrayList<String> getInfos(ArrayList<String> familyNameStrList,ArrayList<String> boyNameList,ArrayList<String> girlNameList,int boycount,int girlcount){

        //1.生成男生不重复的名字
        ArrayList<String> byhs=new ArrayList<>();
        while(true){
            if(byhs.size()==boycount){
                break;
            }

            //否则就随机生成男生的名字
            //用collectios的shuffle方法来进行打乱顺序
            Collections.shuffle(familyNameStrList);
            Collections.shuffle(boyNameList);

            //组合名字加入男生列表
            byhs.add(familyNameStrList.get(0)+boyNameList.get(0));


        }
        //System.out.println(byhs);

        //1.生成女生不重复的名字
        ArrayList<String> glhs=new ArrayList<>();
        while(true){
            if(glhs.size()==girlcount){
                break;
            }

            //否则就随机生成男生的名字
            //用collectios的shuffle方法来进行打乱顺序
            Collections.shuffle(familyNameStrList);
            Collections.shuffle(girlNameList);

            //组合名字加入男生列表
            glhs.add(familyNameStrList.get(0)+girlNameList.get(0));


        }
        //System.out.println(glhs);

        //再将名字组合成最终需要的格式
        ArrayList<String> list=new ArrayList<>();

        //男生的年龄规定再18-26
        /*
         *   求解过程: 18-26   减去18->0-8   8再加1就是括号里面的值,18就是加在外面的值
         * */
        Random r1 = new Random();
        for (String byh : byhs) {
            //生成年龄
            int age= r1.nextInt(9)+18;
            //拼接加入list
            list.add(byh+"-"+"男"+"-"+age);
        }


        //男生的年龄规定再25-36
        /*
         *   求解过程: 25-36   减去25->0-11  11再加1就是括号里面的值,25就是加在外面的值
         * */
        Random r2 = new Random();
        for (String byh : byhs) {
            //生成年龄
            int age= r2.nextInt(11)+25;
            //拼接加入list
            list.add(byh+"-"+"女"+"-"+age);
        }

        //返回集合即可
        return list;

    }
}
