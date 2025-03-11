package com.example.patterns.strategyfactory;

public class PaymentFactory {

    public static PaymentMethod getPaymentMethod(String paymentMethod)
    {
        if(paymentMethod.equalsIgnoreCase("CreditCard"))
            return new CreditCardpaymentmethod();
        if(paymentMethod.equalsIgnoreCase("upi"))
                return new UPIpaymentmethod();

        return new UPIpaymentmethod();

    }

}
