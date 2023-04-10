package jdk8.a07defaultMethod;

public class MyClass implements MyInterface1,MyInterface2{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }

    @Override
    public void myMethod() {
        MyInterface2.super.myMethod();
    }
}
