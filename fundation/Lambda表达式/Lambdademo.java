package Lambda表达式;

public class Lambdademo {
    public static void main(String[] args) {
        Integer[] arr={2,6,9,48,7,4,6,2,3,9};

        method(new Swim() {
            @Override
            public void swim() {
                System.out.println("正在游泳");
            }
        });


        //用lambda表达式进行改写
        method(
                ()->{
                    System.out.println("正在游泳....");
                }
        );
    }


    //接口作为参数，在调用函数的时候要传递，它的实现类
    public static void  method(Swim s){
        s.swim();
    }
}
