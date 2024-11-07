package 斗地主2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    //牌盒
   static HashMap<Integer,String> map=new HashMap<>();
   static ArrayList<Integer> list=new ArrayList<>();  //用来装序号
   //准备牌

   static {
       String[] color={"♦", "♣", "♥","♠"};
       String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

       //定义一个牌序变量
       int serialNumber=0;
       for (String n : number) {
           for (String c : color) {
               String poker=c+n;
               map.put(++serialNumber,poker);
               list.add(serialNumber);
           }
       }

       //加上大小王
       map.put(++serialNumber,"小王");
       list.add(serialNumber);
       map.put(++serialNumber,"大王");
       list.add(serialNumber);


   }

   PokerGame(){
//       System.out.println(map);
//       System.out.println(map);
//       System.out.println(list);
       //洗牌
       Collections.shuffle(list);

       //发牌

       //定义四个集合

    //创建四个有序集合用来装牌
       TreeSet<Integer> lord=new TreeSet<>();
       TreeSet<Integer> player1=new TreeSet<>();
       TreeSet<Integer> player2=new TreeSet<>();
       TreeSet<Integer> player3=new TreeSet<>();

       for (int i = 0; i < list.size(); i++) {

           int poker=list.get(i);
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
//       System.out.println(player1);
//       System.out.println(player2);
//       System.out.println(player3);

       //看牌
       lookPoker("底牌",lord);
       lookPoker("小万",player1);
       lookPoker("小罗",player2);
       lookPoker("小李",player3);
   }

   public static void lookPoker(String name,TreeSet<Integer> t){

        //将序号和牌进行对应
       System.out.print(name+":");

       for (Integer i : t) {
           System.out.print(map.get(i)+" ");
       }
        //换行
       System.out.println();
   }

}
