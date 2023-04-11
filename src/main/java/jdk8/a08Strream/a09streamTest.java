package jdk8.a08Strream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class a09streamTest {
    /**
     * 流的短路与并发
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5000000);
        long start = System.nanoTime();
        for (int i = 0; i < 5000000; i++) {
            list.add(UUID.randomUUID().toString());
        }
        long l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
        System.out.println("生成数据"+l+"ms");
        start = System.nanoTime();
        //排序耗时4184ms
        //long count = list.stream().sorted().count();
        //排序耗时3869ms,并行流更快
        long count = list.parallelStream().sorted().count();
        l = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start);
        System.out.println("排序耗时"+l+"ms");
    }
}
