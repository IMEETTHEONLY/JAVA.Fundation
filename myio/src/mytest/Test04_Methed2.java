package mytest;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test04_Methed2 {

    public static void main(String[] args) throws IOException {
        //利用treemap进行排序

        //创建集合   自动排序
        TreeMap<Integer,String> treeMap=new TreeMap<>();

        //开始读取数据
        BufferedReader br=new BufferedReader(new FileReader("myio\\csb.txt"));

        String str;

        while ((str=br.readLine())!=null){

            //将每一行分割存入treemap当中
            String[] split = str.split("\\.");
            treeMap.put(Integer.parseInt(split[0]),split[1]);
        }

        //打印treemap
        System.out.println(treeMap);


        //向新文件当中写入数组
        BufferedWriter bw=new BufferedWriter(new FileWriter("myio\\newcsb2.txt"));

        //遍历treemap并写入文件
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
                bw.write(treeMap.get(entry.getKey()));
                //换行
            bw.newLine();
        }
        //关闭流
        bw.close();
    }

    }

