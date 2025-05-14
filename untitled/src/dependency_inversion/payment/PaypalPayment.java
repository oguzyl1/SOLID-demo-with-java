package dependency_inversion.payment;

public class PaypalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paypal ile ödeme yapıldı: " + amount);
    }
}
