package jdk8.a05optional;


import java.util.Optional;

public class a01optionalTest {
    /**
     * 为了解决NPE问题  NullPointerException
     * Optional本质上就是一个容器
     */
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        Optional<String> hello = optional.ofNullable("hello");
        //不推荐
//        if (optional.isPresent()){
//            System.out.println(optional.get());
//        }
        //推荐的optional使用方式
        optional = Optional.empty();
        /********下一行重要****start***写代码常用方式******/
        optional.ifPresent(item -> System.out.println(item));
        System.out.println("--------------------------");
        //optional = Optional.empty();
        System.out.println(optional.orElse("world"));
        //有就返回存在的值，否则返回表达式中的值
        System.out.println(optional.orElseGet(()->"nihao"));
        /********下一行重要****end*********/
    }
}
