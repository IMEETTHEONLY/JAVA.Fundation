package Steam流.Stream流练习题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        //两个集合，第一个存男演员的名字和年龄，第二个存女演员。

        /*
        *
        *       1，男演员只要名字为3个字的前两人
                2，女演员只要姓杨的，并且不要第一个
                3，把过滤后的男演员姓名和女演员姓名合并到一起
                4，将上一步的演员信息封装成Actor对象。
                5，将所有的演员对象都保存到List集合中。
        *
        *
        * */
        //男演员
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"蔡坤坤,24","叶密码,24","刘不填,26","吴倩,16");

        //女演员
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"杨茂,24","杨密码,24","杨嘛,26","吴倩,16");

        //处理男演员
        List<String> collect = list1.stream().
                limit(2).
                filter(s -> s.split(",")[0].
                        length()==3).collect(Collectors.toList());

       //处理女演员
        List<String> collect1 = list2.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1).collect(Collectors.toList());
//        System.out.println(collect1);


        //将两个集合合并起来,封装到Actor,并放到list集合当中
        List<Actor> collect2 = Stream.concat(collect.stream(), collect1.stream()).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String[] split = s.split(",");
                Actor actor = new Actor();
                actor.setName(split[0]);
                actor.setAge(Integer.parseInt(split[1]));
                return actor;
            }
        }).collect(Collectors.toList());

        System.out.println(collect2);

    }
}
