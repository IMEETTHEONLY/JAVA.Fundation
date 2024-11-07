package 泛型.泛型小练习;

public class LIhuaCat extends cat {

    //重写eat方法，不作为抽象方法。
    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+","+getAge()+"岁的狸花猫，正在吃鱼");
    }

}
