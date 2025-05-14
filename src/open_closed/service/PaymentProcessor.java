package open_closed.service;

import open_closed.model.Payment;

public class PaymentProcessor {

    private Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void processPayment(double amount){
        payment.processPayment(amount);
    }
}

