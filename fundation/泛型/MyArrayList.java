package 泛型;

import java.util.Arrays;

/*
*    当我在编写一个类的时候，不确定类型，就可以定义为泛型类。
*
* */
public class MyArrayList<E> {

    Object[] obj=new Object[10];
    int size;

    /*E就是要传入的数据类型*/
    public boolean add(E e){
        obj[size]=e;
        size++;
        return true;

    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
