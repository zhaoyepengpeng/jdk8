package jdk8.a08Strream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a10streamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hel5lo", "world", "hello world");
        //打印第一个长度为5的单词
        //Optional<String> first = list.stream().filter(item -> item.length() == 5).findFirst();
        //first.ifPresent(System.out::println);
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);

        list = Arrays.asList("hello welcome", "world hello", "hello world hello", "hello world", "hello welcome");
        Stream<String> stream = list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream);
        List<String> collect = stream.distinct().collect(Collectors.toList());
        System.out.println(collect);
        //Executors.newCachedThreadPool()

//         public ThreadPoolExecutor(int corePoolSize,
//        int maximumPoolSize,
//        long keepAliveTime,
//        TimeUnit unit,
//        BlockingQueue<Runnable> workQueue,
//        ThreadFactory threadFactory,
//        RejectedExecutionHandler handler)
    }
}
