package com.example.patterns.prototypeandregistry;

public class Client {

    public static void registerPrototype(StudentRegistry studentRegistry) {
        Student student = new Student();
        student.setBatch("2025");
        studentRegistry.register("student", student);


        Student intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatch("2030");
        studentRegistry.register("intelligentStudent", intelligentStudent);
    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        registerPrototype(studentRegistry);

        Student student = studentRegistry.getStudent("student");
        System.out.println(student);
        Student intelligentStudent = studentRegistry.getStudent("intelligentStudent");
        System.out.println(intelligentStudent);

    }

}
