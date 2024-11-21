package myiotest1;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test7 {

    /*
    *
    *       每次被点到的学生，再次被点到的概率在原先基础上降低一半。
    *
    *
    *
    * */


    public static void main(String[] args) throws IOException {


        //1.首先从文件当中把名字读取出来
        ArrayList<Student> list=new ArrayList<>();

        //利用buffer的读取一行
        BufferedReader br=new BufferedReader(new FileReader("java_fundation\\myiotest\\src\\MyFile\\file3"));

        //读取数据
        String str;
        while ((str=br.readLine())!=null){
           //将数据分割创建对象之后然后加入list
            String[] split = str.split("-");
            Student s=new Student(split[0],split[1],Integer.parseInt(split[2]),Double.parseDouble(split[3]));
            //将学生对象加入数组
            list.add(s);
        }
        //关闭流
        br.close();
        //System.out.println(list);

        //2.计算权重的总和
        double weight=0;
        for (Student student : list) {
            weight+=student.getWeight();
        }
        //System.out.println(weight);


        //3.用一个数组来保存每一个权重占比
        Double[] arr=new Double[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i).getWeight()/weight;
        }
        //System.out.println(Arrays.toString(arr));


        //4.计算每一个成员的占比范围
        //难点就在于:后一个人的范围等于前一个的最大值加上自己的占比  就想一个点随机落到一个区域的概率
        for(int i=1;i<arr.length;i++){
            //当前值等于本身加上前一个值
            arr[i]=arr[i-1]+arr[i];
        }

      //  System.out.println(Arrays.toString(arr));

        //5.产生一个0-1之间的随机数，代表随机抽取到的人
        Random r=new Random();
        double i = r.nextDouble(1);
        System.out.println(i);


        //用二分法找插入点
        //方法返回出来的插入点是   -插入点-1
        //key=-插入点-1     插入点=-key-1
        int key = Arrays.binarySearch(arr, i);
        int insert=-key-1;
        System.out.println(key);
        System.out.println(insert);

        //修改被抽人的概率
        //获取被抽取人的概率
        double p_weight=list.get(insert).getWeight();
        //概率减半
        p_weight/=2;

        //重新设置
        list.get(insert).setWeight(p_weight);

        System.out.println(list);
        //再写入文件

        BufferedWriter bw=new BufferedWriter(new FileWriter("java_fundation\\myiotest\\src\\MyFile\\file3"));

        for (Student student : list) {
            bw.write(student.toString());
            //换行
            bw.newLine();

        }
        //关闭流
        bw.close();

    }

}
