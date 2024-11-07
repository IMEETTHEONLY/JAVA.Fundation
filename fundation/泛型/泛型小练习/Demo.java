package 泛型.泛型小练习;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

        ArrayList<BosiCat> list1=new ArrayList<>();
        ArrayList<LIhuaCat> list2=new ArrayList<>();
        ArrayList<TaidiDog> list3=new ArrayList<>();
        ArrayList<HashiqiDog> list4=new ArrayList<>();


        keepPet(list1);
        keepPet(list2);
        keepPet(list3);
        keepPet(list4);


    }

    //饲养猫的方法，可以饲养所有的猫，但不能养狗
//    public static void keepPet(ArrayList<? extends cat> list){
//
//    }

    //可以饲养所有的狗，但不能养猫
//    public static void keepPet(ArrayList<? extends Dog> list){
//
//    }

    //可以养所有的动物
        public static void keepPet(ArrayList<? extends Animal> list){

    }
}
