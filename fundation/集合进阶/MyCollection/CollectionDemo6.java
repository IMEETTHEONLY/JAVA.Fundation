package 集合进阶.MyCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo6 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");



//        //底层原理是:通过for循环得到集合里面的值，然后传递给accpet方法。(选中forEach右键go to，查看他的实现类AarryList的方法)
//        coll.forEach(new Consumer<String>() {
//            @Override
//            //s就是集合里面的数据
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });


        //利用lambda表示式进行遍历
        coll.forEach( s-> System.out.println(s));
    }
}
