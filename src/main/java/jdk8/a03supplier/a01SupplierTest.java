package jdk8.a03supplier;

import java.util.function.Supplier;

public class a01SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
    }
}
