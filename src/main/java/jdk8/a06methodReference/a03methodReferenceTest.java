package jdk8.a06methodReference;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class a03methodReferenceTest {
    public static void main(String[] args) {
        List<Student> students = CreateStudentList.getInstance();
        students.sort(Student::compareByScore);
        students.forEach(item -> System.out.println(item));
        a03methodReferenceTest a03methodReferenceTest = new a03methodReferenceTest();
        System.out.println(a03methodReferenceTest.getString(String::new));
        //hello
        System.out.println(a03methodReferenceTest.getString2("hello",String::new));
    }

    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }
}
