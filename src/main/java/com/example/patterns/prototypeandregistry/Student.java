package com.example.patterns.prototypeandregistry;

public class Student implements Prototype<Student>{

    private int id;
    private String name;
    private String address;
    private String batch;

    public Student() {
    }

    public Student(Student student)
    {
        this.id= student.getId();
        this.name=student.getName();
        this.address=student.getAddress();
        this.batch=student.getBatch();
    }


    @Override
    public Student clone() {
        return new Student(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }
}
