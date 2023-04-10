package jdk8.a07defaultMethod;

public interface MyInterface1 {
    default void myMethod(){
        System.out.println("MyInterface1");
    }
}
