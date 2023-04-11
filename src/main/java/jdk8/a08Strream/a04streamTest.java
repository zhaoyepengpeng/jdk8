package jdk8.a08Strream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a04streamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
//        List<String> collect = list.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
        List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        collect.forEach(System.out::println);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        // 1 4 9 16 25
        list2.stream().map(item -> item * item).collect(Collectors.toList()).forEach(System.out::println);
        /********FlatMap*****************/
        System.out.println(" /********FlatMap*****************/");
        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        listStream.flatMap(theList -> theList.stream()).map(item -> item * item).forEach(System.out::println);
        /********FlatMap*****************/
        System.out.println("/********FlatMap*****************/");



    }
}
