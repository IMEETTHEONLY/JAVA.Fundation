package 集合进阶.List;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//List集合特有的方法
public class ListDemo1 {
    public static void main(String[] args) {

        //创建一个集合
        List<String> list=new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        //在指定位置加如元素
        //它会把加入元素后面的元素依次向后移动
//        list.add(1,"qqq");
//        System.out.println(list);

        //删除元素
//        String s=list.remove(0);
//        System.out.println(s);
//        System.out.println(list);


        //修改指定索引的元素，返回被修改的值
//        String result=list.set(0,"QQQ");
//        System.out.println(result);
//        System.out.println(list);


        //获取元素
        String s=list.get(0);
        System.out.println(s);



    }
}
