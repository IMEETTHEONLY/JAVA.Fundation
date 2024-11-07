package 集合进阶.MyCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {

        //Collection是接口，不能直接实例化，所以说用多态的方式将它的子类new出来，再赋予父类。相同的方法父类都会实现。
        Collection<String> coll=new ArrayList<>();

        //添加元素
        //List添加数据可重复，永远返回true
        //Set数据不重复，如果说数组里面已经有添加元素返回false
         coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //删除
        //因为Collection定义的是共性的方法所以说只能通过对象删除，不能通过索引删除
        //如果说元素存在则删除成功返回ture
        coll.remove("bbb");
        System.out.println(coll);

        //判断元素是否存在
        //底层是根据equals方法进行实现的，所以在判断自定义对象是否存在时要重写equals，因为equals比较的是自定义对象的地址
        Boolean result=coll.contains("aaa");
        System.out.println(result);


    }
}
