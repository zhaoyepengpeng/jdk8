package jdk8.a03supplier;

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
    private int age = 20;
}
