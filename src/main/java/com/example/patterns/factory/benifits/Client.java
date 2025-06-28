package com.example.patterns.factory.benifits;

public class Client {
    public static void main(String[] args) {
        Benifits benifits = Benifitfactory.getBenifit("engineer");
        benifits.shareDiscount();
        benifits.healthBenifit();
    }
}
