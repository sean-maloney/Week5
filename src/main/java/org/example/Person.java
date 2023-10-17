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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age=scanner.nextInt();

    }
    public void displayInfo(){
        System.out.println("Name: "+ getFirst() + " "+ getLast() + ", Age:"+getAge());
    }

    //Getters

    public String getFirst(){
        return firstName;
    }

    public String getLast(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    //Setters
    public void setFirst(String firstName){
        this.firstName=firstName;
    }

    public void setLast(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        this.age=age;
    }


    private String firstName;

    private String lastName;

    private int age;
}

