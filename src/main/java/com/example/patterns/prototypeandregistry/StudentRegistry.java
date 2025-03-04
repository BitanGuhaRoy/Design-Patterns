package com.example.patterns.prototypeandregistry;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student >hm;

    public StudentRegistry() {
        hm = new HashMap<>();
    }

    public void register(String key, Student student) {
        hm.put(key, student);
    }

    public Student getStudent(String key) {
        return hm.get(key).clone();
    }
}
