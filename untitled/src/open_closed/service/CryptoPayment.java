package open_closed.service;

import open_closed.model.Payment;

public class CryptoPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Ödeme kripto ile yapıldı : " + amount);
    }
}
