package jdk8.a08Strream;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a03streamTest {
    public static void main(String[] args) {
//        Stream<String> stringStream = Stream.of("hello","world","hello world");
//        // <A> A[] toArray(IntFunction<A[]> generator);
//        String[] stringArray = stringStream.toArray(length -> new String[length]);
//        Arrays.asList(stringArray).forEach(System.out::println);
        Stream<String> stream = Stream.of("hello", "world", "hello world");
        List<String> list = stream.collect(() -> new ArrayList<>(), (theList, item) -> theList.add(item), (theList1, theList2) -> theList1.addAll(theList2));
        list.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("hello", "world", "hello world");
        List<String> list1 = stream1.collect(Collectors.toCollection(ArrayList::new));
        list1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("hello", "world", "hello world");
        TreeSet<String> collect = stream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(collect.getClass().getName());
        collect.forEach(System.out::println);

        Stream<String> stream3 = Stream.of("hello", "world", "hello world");
        String s = stream3.collect(Collectors.joining()).toString();
        System.out.println(s);

    }
}
