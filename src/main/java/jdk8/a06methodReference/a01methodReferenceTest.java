package jdk8.a06methodReference;

import java.util.Arrays;
import java.util.List;

public class a01methodReferenceTest {
    /**
     * 方法引用分为4类
     * 01.类名::方法名System.out::println
     * 02.引用名(对象名)::实例方法名
     * 03.类名::实例方法名
     * 04.::
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
//        下行是方法引用方式
        list.forEach(System.out::println);

    }
}
