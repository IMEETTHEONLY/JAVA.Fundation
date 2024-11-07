package 集合进阶.MyCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {


        public static void main(String[] args) {
            //创建集合
            Collection<String> coll=new ArrayList<>();

            coll.add("aaa");
            coll.add("bbb");
            coll.add("ccc");
            coll.add("ddd");
            coll.add("eee");

            //获取迭代器对象
            Iterator<String> it=coll.iterator();

            //利用循环获取集合每一个元素  it相当于就是一个指针
            while (it.hasNext()){
                //1.获取元素  2.移动指针
                //循环中只能使用一次next方法,因为next会移动指针
//                System.out.println(it.next());
                String str=it.next();

//                //并发操作，不能边读边写
//                if ("bbb".equals(str)) {
//                    coll.remove("bbb");
//                }

                if("bbb".equals(str)){
                    it.remove();
                }
                System.out.println(coll);
            }

            //循环结束，迭代器指向没有元素的位置
//        System.out.println(it.next());  //获取不到



        }
    }


