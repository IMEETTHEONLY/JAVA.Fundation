package 泛型;

import java.util.ArrayList;
import java.util.Iterator;

//没有泛型的时候如何存储数据
public class GenericsDemo1 {
    public static void main(String[] args) {


        //创建对象
        ArrayList<String> list=new ArrayList<>();

        //添加数据
       // list.add(123);
        list.add("aaa");
        //list.add(new Student("张三",123));

        //遍历集合获取元素
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            //多态的弊端无法获取子类的功能
            String str=it.next();
            System.out.println(str);

        }
    }
}
