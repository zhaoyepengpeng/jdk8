package jdk8.a08Strream02;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;

/**
 * Collector的实现
 */
public class a01StreamTest {

    public static void main(String[] args) {
        List<Student> students = getStudents();

    }


    public static List<Student> getStudents() {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 100);
        Student student4 = new Student("zhaoliu", 80);
        return Arrays.asList(student1, student2, student3, student4);
    }
}
