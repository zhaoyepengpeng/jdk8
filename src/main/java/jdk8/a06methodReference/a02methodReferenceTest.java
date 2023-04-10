package jdk8.a06methodReference;

import jdk8.a03supplier.Student;

import java.util.Arrays;
import java.util.List;

public class a02methodReferenceTest {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 10);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 50);
        Student student4 = new Student("zhaoliu", 40);
        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        System.out.println(students);
        System.out.println("---------------------------------------");

        students.sort((studentParam1, studentParam2) -> Student.compareStudentByScore(studentParam1, studentParam2));
        students.forEach(System.out::println);
        System.out.println("---------------------------------------");
        students.sort(Student::compareStudentByName);
        students.forEach(System.out::println);

    }
}
