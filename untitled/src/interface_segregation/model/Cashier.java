package interface_segregation.model;

import interface_segregation.interfaces.PaymentProcessing;

public class Cashier implements PaymentProcessing {
    @Override
    public void processPayment() {
        System.out.println("Kasiyer ödeme alıyor.");
    }
}
