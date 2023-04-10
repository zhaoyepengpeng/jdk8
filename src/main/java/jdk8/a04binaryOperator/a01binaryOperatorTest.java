package jdk8.a04binaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class a01binaryOperatorTest {
    public static void main(String[] args) {
        a01binaryOperatorTest a01binaryOperatorTest = new a01binaryOperatorTest();
        System.out.println(a01binaryOperatorTest.compute(1, 2, (a, b) -> a + b));
        System.out.println("---------------------------");
        String aShort = a01binaryOperatorTest.getShort("hello123", "world", (a, b) -> a.length() - b.length());
        System.out.println("short:" + aShort);
        aShort = a01binaryOperatorTest.getShort("hello123", "world", Comparator.comparingInt(String::length));
        System.out.println("short:" + aShort);
        aShort = a01binaryOperatorTest.getShort("hello123", "world", (a, b) -> a.charAt(0) - b.charAt(0));
        System.out.println("short:" + aShort);

    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }

}
