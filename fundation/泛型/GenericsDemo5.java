package 泛型;

import java.util.ArrayList;

//泛型的继承和通配符
public class GenericsDemo5 {
    public static void main(String[] args) {

        //泛型不具备继承性，数据具备继承性
        ArrayList<ye> list1=new ArrayList<>();
        ArrayList<Fu> list2=new ArrayList<>();
        ArrayList<Zi> list3=new ArrayList<>();

        //调用methed
//        methed(list1);
//        methed(list2);
//

        //数据具有继承性说的是多态，集合里面可以加入子类
        list1.add(new ye());
        list1.add(new Fu());
    }

    public static void methed(ArrayList<ye> lsit){

    }

}


class ye{}
class  Fu extends ye{}
class Zi extends Fu{}
