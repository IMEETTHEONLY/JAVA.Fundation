package 泛型;

import java.util.ArrayList;

//泛型小练习
public class GenericsDemo6 {
    public static void main(String[] args) {

        /*
        *   需求:
        *       定义一个方法，形参是一个集合，但是集合中的数据类型不确定
        *
        * */
        ArrayList<ye> list1=new ArrayList<>();
        ArrayList<Fu> list2=new ArrayList<>();
        ArrayList<Zi> list3=new ArrayList<>();

        ArrayList<student2> list4=new ArrayList<>();

        methed(list1);
        methed(list2);
        methed(list3);

        //methed(list4);
    }
    //修改只能传递一类类型
    public static<E> void methed(ArrayList<? super Zi> lsit){

    }
}


class student2{}