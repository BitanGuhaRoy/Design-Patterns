//package com.example.patterns.builder;
//
//public class StudentBuilder {
//    private int age;
//    private String name;
//    private String gender;
//    private String address;
//    private String phone;
//    private String email;
//    private String school;
//    private String major;
//    private String grade;
//    private int gradYear;
//
//    public StudentBuilder() {
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public StudentBuilder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public StudentBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public StudentBuilder setGender(String gender) {
//        this.gender = gender;
//        return this;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public StudentBuilder setAddress(String address) {
//        this.address = address;
//        return this;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public StudentBuilder setPhone(String phone) {
//        this.phone = phone;
//        return this;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public StudentBuilder setEmail(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public String getSchool() {
//        return school;
//    }
//
//    public StudentBuilder setSchool(String school) {
//        this.school = school;
//        return this;
//    }
//
//    public String getMajor() {
//        return major;
//    }
//
//    public StudentBuilder setMajor(String major) {
//        this.major = major;
//        return this;
//    }
//
//    public String getGrade() {
//        return grade;
//    }
//
//    public StudentBuilder setGrade(String grade) {
//        this.grade = grade;
//        return this;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public StudentBuilder setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public Student build() {
//        // validation logic
//        return new Student(this);
//    }
//}