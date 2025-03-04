package com.example.patterns.prototypeandregistry;

public class IntelligentStudent extends Student {

    int id;

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.id = intelligentStudent.id;

    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return super.toString()+"IntelligentStudent{" + "id=" + id + '}';
    }

}
