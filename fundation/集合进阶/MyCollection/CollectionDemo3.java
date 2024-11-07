package 集合进阶.MyCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//迭代器的使用
public class CollectionDemo3 {
    public static void main(String[] args) {
        //创建集合
        Collection<String> coll=new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //获取迭代器对象
        Iterator<String> it=coll.iterator();

        //利用循环获取集合每一个元素
        while (it.hasNext()){
            //1.获取元素  2.移动指针
            //循环中只能使用一次next方法
            String str= it.next();
            System.out.println(str);
        }

        //循环结束，迭代器指向没有元素的位置
//        System.out.println(it.next());  //获取不到



    }
}
