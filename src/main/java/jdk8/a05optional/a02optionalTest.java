package jdk8.a05optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class a02optionalTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");
        Employee employee2 = new Employee();
        employee2.setName("lisi");
        Company company = new Company();
        company.setName("company1");
        List<Employee> employees = Arrays.asList(employee, employee2);
        company.setEmployees(employees);
        Optional<Company> optional = Optional.ofNullable(company);
        optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()).forEach(System.out::println);
        System.out.println(optional.map(theCompany->theCompany.getEmployees()).orElse(Collections.emptyList()));
    }
}
