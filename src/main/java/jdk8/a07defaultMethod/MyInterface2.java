package jdk8.a07defaultMethod;

public interface MyInterface2 {
    default void myMethod(){
        System.out.println("MyInterface2");
    }
}
