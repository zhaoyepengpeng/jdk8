package jdk8.a01lambda;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.function.Function;

/**
 * @className: a03FunctionTest
 * @author: zhaoyepeng
 * @date: 2023-04-07 21:12:42
 **/
public class a03FunctionTest {
    public static void main(String[] args) {
        a03FunctionTest a03FunctionTest = new a03FunctionTest();
        System.out.println(a03FunctionTest.compute(1, value -> 2*value));
        System.out.println(a03FunctionTest.compute(2,value ->5+value));
        System.out.println(a03FunctionTest.convert(10, value->String.valueOf(value+" hello world")));
    }

    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }
    public  String convert(int a,Function<Integer,String> function){
        return function.apply(a);
    }
}
