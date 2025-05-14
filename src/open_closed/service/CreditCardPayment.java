package open_closed.service;

import open_closed.model.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Ödeme kredi kartı ile yapıldı: " + amount);
    }
}
