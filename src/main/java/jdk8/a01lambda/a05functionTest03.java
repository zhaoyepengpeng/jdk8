package jdk8.a01lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @className: a05functionTest03
 * @author: zhaoyepeng
 * @date: 2023-04-08 08:37:31
 **/
public class a05functionTest03 {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);
        List<Person> persons = Arrays.asList(person1, person2, person3);
        a05functionTest03 a05functionTest03 = new a05functionTest03();
        List<Person> personResult = a05functionTest03.getPersonByUsername("zhangsan", persons);
        personResult.forEach(person -> System.out.println("getPersonByUsername:" + person.getUsername()));
        a05functionTest03.getPersonByAge(25, persons).forEach(person -> System.out.println("getPersonByAge:" + person.getUsername() + "-----" + person.getAge()+ "-----" ));

    }

    public List<Person> getPersonByUsername(String username, List<Person> persons) {
        return persons.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (agePerson, personList) -> {
            return personList.stream().filter(person -> person.getAge() > agePerson).collect(Collectors.toList());
        };
        return biFunction.apply(age, persons);
    }
}
