package jdk8.a04binaryOperator;

import java.util.function.BinaryOperator;

public class a01binaryOperatorTest {
    public static void main(String[] args) {
        a01binaryOperatorTest a01binaryOperatorTest = new a01binaryOperatorTest();
        System.out.println(a01binaryOperatorTest.compute(1, 2, (a, b) -> a + b));

    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }
}
