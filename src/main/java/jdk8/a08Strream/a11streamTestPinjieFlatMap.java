package jdk8.a08Strream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class a11streamTestPinjieFlatMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu","zhaoliu");
        List<String> collect = list1.stream().flatMap(item -> list2.stream().map(item2 -> item + " " + item2)).collect(Collectors.toList());
        //[Hi zhangsan, Hi lisi, Hi wangwu, Hi zhaoliu,
        // Hello zhangsan, Hello lisi, Hello wangwu, Hello zhaoliu,
        // 你好 zhangsan, 你好 lisi, 你好 wangwu, 你好 zhaoliu]
        System.out.println(collect);
    }
}
