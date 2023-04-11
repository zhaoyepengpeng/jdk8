package jdk8.a08Strream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class a13streamTestPartitionBy {
    public static void main(String[] args) {
        /**
         * 分区中只有true 和 false
         */
        List<Student1> students = getStudents();
        Map<Boolean, List<Student1>> collect = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
        //{false=[Student1(name=zhaoliu, score=80, age=70)],
        // true=[Student1(name=zhangsan, score=100, age=20), Student1(name=lisi, score=90, age=20), Student1(name=wangwu, score=90, age=30)]}
        System.out.println(collect);
    }

    public static List<Student1> getStudents() {
        Student1 student1 = new Student1("zhangsan", 100, 20);
        Student1 student2 = new Student1("lisi", 90, 20);
        Student1 student3 = new Student1("wangwu", 90, 30);
        Student1 student4 = new Student1("zhaoliu", 80, 70);
        return Arrays.asList(student1, student2, student3, student4);
    }
}
