package jdk8.a08Strream;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class a05streamTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
        //返回Optional 是为了规避NPE风险
        // Stream<String> stream = Stream.empty();
        stream.findFirst().ifPresent(System.out::println);
        //本行测试
        Stream<Integer> stream1 = Stream.iterate(1, item -> item + 2).limit(6);
        System.out.println("stream1-end");

        //  1 3 5 7 9 11
        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);

        //过滤出大于2的元素，然后将这些元素*2,忽略前两个元素  即  14（7*2） + 18（9*2） =32
//        int sum = stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum();
//        System.out.println(sum);
        //IntStream limit = stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2);
        System.out.println("===================找出最大值==========================");
//        OptionalInt max = stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).max();
//        max.ifPresent(item -> System.out.println(item));
        //下面返回的
        IntSummaryStatistics intSummaryStatistics = stream1.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
        double average = intSummaryStatistics.getAverage();
        System.out.println(average);
        long count = intSummaryStatistics.getCount();
        int min = intSummaryStatistics.getMin();
        int max = intSummaryStatistics.getMax();
        long sum = intSummaryStatistics.getSum();


    }
}
