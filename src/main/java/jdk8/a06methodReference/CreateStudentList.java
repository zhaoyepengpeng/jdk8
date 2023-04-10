package jdk8.a06methodReference;

import jdk8.a06methodReference.Student;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class CreateStudentList {
    private static List<Student> students = null;
    public static List<Student> getInstance(){
        if (null == students){
            synchronized (CreateStudentList.class){
                if (null == students){
                    Student student1 = new Student("zhangsan", 10);
                    Student student2 = new Student("lisi", 90);
                    Student student3 = new Student("wangwu", 50);
                    Student student4 = new Student("zhaoliu", 40);
                    students = Arrays.asList(student1, student2, student3, student4);
                }
            }
        }
        return students;
    }

}
