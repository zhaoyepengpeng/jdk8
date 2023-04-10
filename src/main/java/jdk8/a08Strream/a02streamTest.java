package jdk8.a08Strream;

import java.util.stream.IntStream;

public class a02streamTest {
    public static void main(String[] args) {
        IntStream.of(new int[]{5, 6, 7}).forEach(System.out::println);
        System.out.println("------------------------------------");
        //打印出来是34567，包头不包尾
        IntStream.range(3, 8).forEach(System.out::println);
        int sum = IntStream.range(1, 1000).sum();
        System.out.println(sum);

    }
}
