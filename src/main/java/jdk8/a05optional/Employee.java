package jdk8.a05optional;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Employee {
    private String name;
}
