package dependency_inversion.service;

import dependency_inversion.payment.Payment;

public class PaymentService {
    private final Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void processPayment(double amount) {
        payment.pay(amount);
    }
}
