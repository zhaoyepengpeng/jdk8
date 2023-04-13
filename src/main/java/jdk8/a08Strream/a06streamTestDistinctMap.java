package jdk8.a08Strream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class a06streamTestDistinctMap {
    static Map<String, String> map = new HashMap<>();
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 90, "beijing", "1");
        Student student2 = new Student("lisi", 52, "shanghai", "2");
        Student student3 = new Student("wangwu", 58, "guangzhou", "4");
        Student student4 = new Student("zhaoliu", 57, "beijing", "3");
        Student student5 = new Student("dongxie", 57, "beijing", "3");
        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
        //按照年龄降序排列
//        List<Student> collect = students.stream().filter(student -> student.getAge() > 52).filter(student -> "beijing".equals(student.getAddress())).sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
//        System.out.println(collect);
        //只取出一个字段
//        List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
//        System.out.println(names);
        //取出两个字段组合成map，并去重 students.stream().sorted(Comparator.comparing(Student::getId)).collec
        Map<String, String> collectMap = students.stream().collect(Collectors.toMap(Student::getId, Student::getName, (oldData, newData) -> newData));
        System.out.println(collectMap);

        map.put("name","zhangsan");
        map.put("name","zhangsan");
        map.put("name","zhangsan");
        map.put("name","zhangsan");
        System.out.println(map);




    }
}
