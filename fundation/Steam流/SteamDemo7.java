package Steam流;

import java.util.ArrayList;
import java.util.Collections;

public class SteamDemo7 {
    public static void main(String[] args) {

        //元素去重  distinct方法（底层是根据hahsset来实现的），故要重写equals和hashcode

        //创建单列集合
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三四","张思","张超","张武","张武","武大靖","武松","武松");

        list.stream().distinct().forEach(s -> System.out.println(s));

    }
}
