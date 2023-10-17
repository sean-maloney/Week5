package org.example;

import java.util.Scanner;

public class Person {
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void getUserInput(){

    }
    public void displayInfo(){
        System.out.println("Name: "+ firstName + " "+ lastName + ", Age:"+age);
    }

    String firstName;

    String lastName;

    int age;
}

