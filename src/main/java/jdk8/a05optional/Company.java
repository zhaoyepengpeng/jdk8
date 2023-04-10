package jdk8.a05optional;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Company {
    private String name;
    private List<Employee> employees;
}
