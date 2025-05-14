package interface_segregation;

import interface_segregation.interfaces.MakeFood;
import interface_segregation.interfaces.OrderTaking;
import interface_segregation.interfaces.PaymentProcessing;
import interface_segregation.model.Cashier;
import interface_segregation.model.Chef;
import interface_segregation.model.Waiter;

public class InterfaceSegregation {
    public static void main(String[] args) {

        OrderTaking waiter = new Waiter();
        waiter.takeOrder();

        MakeFood chef = new Chef();
        chef.makeFood();

        PaymentProcessing cashier = new Cashier();
        cashier.processPayment();

    }
}
