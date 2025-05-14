package open_closed;

import open_closed.service.CreditCardPayment;
import open_closed.service.CryptoPayment;
import open_closed.service.PaymentProcessor;

public class OpenClosed {
    public static void main(String[] args) {
        PaymentProcessor payment1 = new PaymentProcessor(new CreditCardPayment());
        payment1.processPayment(50);

        PaymentProcessor payment2 = new PaymentProcessor(new CryptoPayment());
        payment2.processPayment(50);

    }
}
