package jdk8.a01lambda;

import java.util.Arrays;
import java.util.List;
/**
 * a01function class
 *
 * @author zhaoyepeng
 * @date 2023/04/05
 */
public class a01function {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
        list.stream().map(item -> item.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("");
    }
}
