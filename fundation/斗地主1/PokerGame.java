package 斗地主1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PokerGame {
    //一副牌只需要执行一次就可以了，即你只需要一副牌就可以一直打
    //静态修饰的代码只会执行一次，你随便new多少个PokerGame，我都只有一副牌

    //牌盒
    static ArrayList<String> list=new ArrayList<>();
    //准备牌
    static {
       String[] color={"♦", "♣", "♥","♠"};
       String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

       //开始组合牌
        for (String c : color) {
            for (String n : number) {
                list.add(c+n);
            }
        }
        list.add("大王");
        list.add("小王");

    }



    public  PokerGame(){


        //洗牌


        //相当于是打乱顺序
        Collections.shuffle(list);
        //System.out.println(list);

        //发牌

        //四个集合存储牌
        ArrayList<String> lord=new ArrayList<>();  //地主牌
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();


        //获取到每张牌的索引进行操作
        for (int i = 0; i < list.size(); i++) {
            String poker=list.get(i);
            //当i<=2,那么就是底牌
            if(i<=2){
                lord.add(poker);
                continue;  //地主牌就不需要继续执行下面
            }

            if(i%3==0){
                player1.add(poker);
            } else if (i%3==1) {
                player2.add(poker);
            }
            else {
                player3.add(poker);
            }

        }


        //看牌
        lookPocker("地主牌",lord);
        lookPocker("小万",player1);
        lookPocker("小罗",player2);
        lookPocker("小李",player3);



            }

            public static  void lookPocker(String name,ArrayList<String> list){
                System.out.print(name+":");
                for (String s : list) {
                    System.out.print(s+" ");
                }
                //每打印一副牌就换行
                System.out.println();
            }
}
