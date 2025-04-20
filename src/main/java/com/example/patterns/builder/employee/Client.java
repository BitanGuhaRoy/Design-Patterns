package com.example.patterns.builder.employee;

public class Client {
    public static void main(String[] args) {

        Employee employee =  Employee.builder()
                .setCity("Kolkata ")
                .setAddress("Barasat")
                .setEmail("bitan.roy@gmail")
                .setFirstName("Bitan")
                .setLastName("Roy")
                .setPhone("7044")
                .build();
//        .build();
    }
}
