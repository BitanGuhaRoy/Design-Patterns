package com.example.patterns.factory.benifits;

public class EngineerBenifits implements Benifits {
    @Override
    public double shareDiscount() {
        System.out.println("Engineering Benifits share discount");
        return 0;
    }

    @Override
    public double healthBenifit() {
        System.out.println("Engineering Benifits health benifit");
        return 0;
    }
}
