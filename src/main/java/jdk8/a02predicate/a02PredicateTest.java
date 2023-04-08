package jdk8.a02predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class a02PredicateTest {
    public static void main(String[] args) {
        a02PredicateTest a02PredicateTest = new a02PredicateTest();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //打印所有的偶数
        a02PredicateTest.conditionFilter(list, item -> item % 2 == 0);
        System.out.println("----------------------------");
        //打印所有的奇数
        a02PredicateTest.conditionFilter(list, item -> item % 2 != 0);
        System.out.println("----------------------------");
        //打印所有大于5的数
        a02PredicateTest.conditionFilter(list, item -> item > 5);
        System.out.println("----------------------------");
        //找出大于5并且是偶数的数字
        a02PredicateTest.conditionFilter2(list, item -> item > 5, item -> item % 2 == 0);
        System.out.println("----------------------------");
        a02PredicateTest.conditionFilter3(list, item -> item > 5, item -> item % 2 == 0);
        System.out.println("----------------------------");
        a02PredicateTest.conditionFilter5(list, item -> item > 5, item -> item % 2 == 0);

    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    /**
     * 找出大于5并且是偶数的数字
     *
     * @param list
     * @param predicate
     */
    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate.and(predicate2).test(integer)) {
                System.out.println(integer);
            }
        }
    }
    /**
     * 找出大于5或者是偶数的数字
     *
     * @param list
     * @param predicate
     */
    public void conditionFilter3(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate.or(predicate2).test(integer)) {
                System.out.println(integer);
            }
        }
    }

    /**
     * 找出小于等于5或者是奇数的数字,conditionFilter2取反
     *
     * @param list
     * @param predicate
     */
    public void conditionFilter5(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate.and(predicate2).negate().test(integer)) {
                System.out.println(integer);
            }
        }
    }

}
