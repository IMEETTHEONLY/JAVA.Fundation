package Steam流;

import java.util.stream.Stream;

public class SteamDemo4 {
    public static void main(String[] args) {
        //零散数据类型调用stream.of方法

        Stream.of("a","b","c").forEach(s -> System.out.println(s));
        Stream.of(1,2,3).forEach(s -> System.out.println(s));

    }
}
