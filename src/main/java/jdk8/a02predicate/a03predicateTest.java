package jdk8.a02predicate;

import java.util.function.Predicate;

public class a03predicateTest {
    public static void main(String[] args) {
        a03predicateTest a03predicateTest = new a03predicateTest();
        //false
        System.out.println(a03predicateTest.isEqual("hello").test("obj"));
        //true
        System.out.println(a03predicateTest.isEqual("hello").test("hello"));
    }

    public Predicate<String> isEqual(Object object) {
        return Predicate.isEqual(object);
    }

}
