package jdk8.a01lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @className: Person
 * @author: zhaoyepeng
 * @date: 2023-04-08 08:37:46
 **/
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class Person {
    private String username;
    private int age;
}
