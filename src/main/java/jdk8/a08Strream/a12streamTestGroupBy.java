package jdk8.a08Strream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class a12streamTestGroupBy {
    public static void main(String[] args) {
        Student1 student1 = new Student1("zhangsan", 100, 20);
        Student1 student2 = new Student1("lisi", 90, 20);
        Student1 student3 = new Student1("wangwu", 90, 30);
        Student1 student4 = new Student1("zhaoliu", 80, 70);
        List<Student1> students = Arrays.asList(student1, student2, student3, student4);

        Map<String, List<Student1>> studentsMap = students.stream().collect(Collectors.groupingBy(Student1::getName));
        //{lisi=[Student1(name=lisi, score=90, age=20)],
        // zhaoliu=[Student1(name=zhaoliu, score=80, age=70)],
        // zhangsan=[Student1(name=zhangsan, score=100, age=20)],
        // wangwu=[Student1(name=wangwu, score=90, age=30)]}
        System.out.println(studentsMap);

        //stream().sorted(Comparator.comparing(Student1::getScore))
        Map<Integer, List<Student1>> studentsScoreMap = students.stream().collect(Collectors.groupingBy(Student1::getScore));
        //{80=[Student1(name=zhaoliu, score=80, age=70)],
        // 100=[Student1(name=zhangsan, score=100, age=20)],
        // 90=[Student1(name=lisi, score=90, age=20), Student1(name=wangwu, score=90, age=30)]}
        System.out.println(studentsScoreMap);

        //select name,count(*) from student group by name
        Map<String, Long> nameGroup = students.stream().collect(Collectors.groupingBy(Student1::getName,Collectors.counting()));
        //{lisi=1, zhaoliu=1, zhangsan=1, wangwu=1}
        System.out.println(nameGroup);


        Map<String, Double> collect = students.stream().collect(Collectors.groupingBy(Student1::getName, Collectors.averagingDouble(Student1::getScore)));
        //{lisi=90.0, zhaoliu=80.0, zhangsan=100.0, wangwu=90.0}
        System.out.println(collect);
    }
}
