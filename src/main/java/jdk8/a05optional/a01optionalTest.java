package jdk8.a05optional;


import java.util.Optional;

public class a01optionalTest {
    /**
     * 为了解决NPE问题  NullPointerException
     */
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        //不推荐
//        if (optional.isPresent()){
//            System.out.println(optional.get());
//        }
        //推荐的optional使用方式
        optional.ifPresent(item -> System.out.println(item));
        System.out.println("--------------------------");
        //optional = Optional.empty();
        System.out.println(optional.orElse("world"));
        System.out.println(optional.orElseGet(()->"nihao"));



    }
}
