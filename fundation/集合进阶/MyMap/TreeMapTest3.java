package 集合进阶.MyMap;

import java.util.*;
import java.util.function.Consumer;

//统计"aababcdbcdabcde"字符串里面字符出现的次数，并按照倒序输出
public class TreeMapTest3 {
    public static void main(String[] args) {
        //先把字符串定义出来
        String str="aababcabcdabcde";



        //直接使用默认的conparable即可
        TreeMap<Character,Integer> map=new TreeMap<>();

        //遍历字符串加入hashmap
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                //如果说已经存在就将数量+1
                int tikect=map.get(str.charAt(i));
                tikect++;
                //在将这个值重新赋值给map
                map.put(str.charAt(i),tikect);
            }
            else{
                //此时是第一次加入
                map.put(str.charAt(i),1);
            }
        }

        //遍历集合并拼接
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
//        for (Map.Entry<Character, Integer> entry : entries) {
//            System.out.print(entry.getKey()+"("+entry.getValue()+")"+" ");
//        }

//        //stringbuild方式
//        MyStringBuilder sb=new MyStringBuilder();
//        entries.forEach(new Consumer<Map.Entry<Character, Integer>>() {
//            @Override
//            public void accept(Map.Entry<Character, Integer> characterIntegerEntry) {
//                sb.append(characterIntegerEntry.getKey()+"("+characterIntegerEntry.getValue()+")");
//            }
//        });
//
//        //打印拼接后的结果
//        System.out.println(sb);

        //stringJoiner方式
        StringJoiner sj=new StringJoiner(",","[","]");
        entries.forEach(new Consumer<Map.Entry<Character, Integer>>() {
            @Override
            public void accept(Map.Entry<Character, Integer> characterIntegerEntry) {
                sj.add(characterIntegerEntry.getKey()+"("+characterIntegerEntry.getValue()+")");
            }
        });
        System.out.println(sj);
    }
}
