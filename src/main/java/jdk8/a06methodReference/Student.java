package jdk8.a06methodReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name = "zhangsan";
    private int score = 20;

    /**
     * 根据姓名排序
     */
    public static int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    /**
     * 根据分数排序
     */
    public static int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareByScore(Student student) {
        return this.getScore() - student.getScore();
    }

    public int compareStudentByName(Student student) {
        return this.getName().compareToIgnoreCase(student.getName());
    }

}
