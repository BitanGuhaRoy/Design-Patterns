package com.example.patterns.factory.benifits;

public class ExecutiveBenifits implements Benifits {
    @Override
    public double shareDiscount() {
        System.out.println("Executive Benifits share discount");
        return 0;
    }

    @Override
    public double healthBenifit() {
        System.out.println("Executive Benifits health benifit");
        return 0;
    }
}
