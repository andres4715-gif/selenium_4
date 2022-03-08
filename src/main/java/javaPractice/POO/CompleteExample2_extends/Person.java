package javaPractice.POO.CompleteExample2_extends;

import lombok.Getter;

@Getter
public class Person {

    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}

