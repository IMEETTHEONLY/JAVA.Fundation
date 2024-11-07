package Steam流.Stream流练习题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        //保存年龄大于等于24的人，并把结果收集到map集合当中

        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");

        Map<String, Integer> collect = list.stream().
                filter(s -> Integer.parseInt(s.split(",")[1]) >= 24).
                collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {

                        return s.split(",")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split(",")[1]);
                    }
                }));

        System.out.println(collect);

        System.out.println("===========");
        //修改为lambda表达式
        Map<String, Integer> collect1 = list.stream().
                filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(collect1);
    }
}
