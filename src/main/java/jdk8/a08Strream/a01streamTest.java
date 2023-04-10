package jdk8.a08Strream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class a01streamTest {
    public static void main(String[] args) {
        String[] myArray = {"hello", "world", "hello world"};
        Stream<String> stream1 = Stream.of("hello", "world", "hello world");
        Stream<String> stream2 = Stream.of(myArray);
        Stream<String> stream3 = Arrays.stream(myArray);
        List<String> list = Arrays.asList(myArray);
        Stream stream4 = list.stream();
    }
}
