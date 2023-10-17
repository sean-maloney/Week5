package org.example;

public class Person {
    public Person() {
        this.firstName = "";
        this.lastName="";
        this.age=0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String firstName;

    String lastName;

    int age;
}

