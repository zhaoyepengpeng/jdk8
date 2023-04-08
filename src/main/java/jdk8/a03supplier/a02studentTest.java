package jdk8.a03supplier;

import java.util.function.Supplier;

public class a02studentTest {
    public static void main(String[] args) {
        /**
         * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
         * Supplier 不接受参数，并且返回一个结果
         */
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());
        System.out.println("---------------------------");
        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());
        System.out.println("---------------------------");


    }
}
