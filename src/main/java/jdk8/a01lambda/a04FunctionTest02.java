package jdk8.a01lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @className: a04FunctionTest02
 * @author: zhaoyepeng
 * @date: 2023-04-07 23:02:12
 **/
public class a04FunctionTest02 {
    public static void main(String[] args) {
        a04FunctionTest02 a04FunctionTest02 = new a04FunctionTest02();
        //下行结果是12
        System.out.println(a04FunctionTest02.compute(2, value -> value * 3, value -> value * value));
        //下行结果是36
        System.out.println(a04FunctionTest02.compute2(2, value -> value * 3, value -> value * value));

        System.out.println(a04FunctionTest02.compute3(1, 2, (value1, value2) -> value1 + value2));
        System.out.println(a04FunctionTest02.compute3(1, 2, (value1, value2) -> value1 - value2));
        System.out.println(a04FunctionTest02.compute3(1, 2, (value1, value2) -> value1 * value2));
        System.out.println(a04FunctionTest02.compute3(1, 2, (value1, value2) -> value1 / value2));



    }

    public int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
