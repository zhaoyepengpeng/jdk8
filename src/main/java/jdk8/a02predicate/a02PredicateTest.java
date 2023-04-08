package jdk8.a02predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class a02PredicateTest {
    public static void main(String[] args) {
        a02PredicateTest a02PredicateTest = new a02PredicateTest();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        a02PredicateTest.conditionFilter(list, item -> item % 2 == 0);
        System.out.println("----------------------------");
        a02PredicateTest.conditionFilter(list, item -> item % 2 != 0);
        System.out.println("----------------------------");
        a02PredicateTest.conditionFilter(list, item -> item > 5);
        System.out.println("----------------------------");

    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

}
