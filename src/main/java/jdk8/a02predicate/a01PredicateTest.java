package jdk8.a02predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class a01PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        //false
        System.out.println(Objects.isNull(predicate));
        //true
        System.out.println(predicate.test("hello world"));
    }
}
