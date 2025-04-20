package com.example.patterns.builder;

import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setAddress("Kolkata")
                .setEmail("<EMAIL>")
                .setGender("Male")
                .setAge(18).
                setGradYear(2024).
                setMajor("computer science")
                .build();
        System.out.println(student);
    }

}
