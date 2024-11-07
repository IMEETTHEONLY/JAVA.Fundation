package 泛型;

import java.util.ArrayList;

//工具类
public class ListUtil {
    //定义一个静态方法addAll,添加集合多个元素
    /*
    *
    *   参数一:集合
    *   参数二:要添加的元素
    * */
    public static <E>void addAll(ArrayList<E> list,E e1,E e2,E e3,E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }

}

