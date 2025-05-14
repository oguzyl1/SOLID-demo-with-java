package dependency_inversion;

import dependency_inversion.payment.CreditCardPayment;
import dependency_inversion.payment.PaypalPayment;
import dependency_inversion.service.PaymentService;

public class DependencyInversion {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.processPayment(100);

        PaymentService paymentService2 = new PaymentService(new PaypalPayment());
        paymentService2.processPayment(220);
    }
}
