package com.example.patterns.factory.benifits;

public class Benifitfactory {

    public static Benifits getBenifit(String str){
        if("engineer".equalsIgnoreCase(str)){
            return new EngineerBenifits();
        }
       return new ExecutiveBenifits();
    }
}
