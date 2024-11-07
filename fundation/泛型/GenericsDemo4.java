package 泛型;
//泛型接口使用的两种方式
public class GenericsDemo4 {

    public static void main(String[] args) {
        //1.实现类给出具体的类型(实现类已经实现了定义泛型)
        MyArrayList2 list=new MyArrayList2();
        list.add("aaa");

        //实现类延续泛型，在创建对象的时候再确定类型

        MyArrayList3<String> list3=new MyArrayList3<>();
        list3.add("add");
    }
}
