package jdk8.a06methodReference;

import jdk8.a06methodReference.Student;


import java.util.List;

public class a02methodReferenceTest {
    public static void main(String[] args) {
        List<Student> students = CreateStudentList.getInstance();
        System.out.println(students);
        System.out.println("---------------------------------------");

        students.sort((studentParam1, studentParam2) -> Student.compareStudentByScore(studentParam1, studentParam2));
        students.forEach(System.out::println);
        System.out.println("---------------------------------------");

        students.forEach(System.out::println);

    }
}
