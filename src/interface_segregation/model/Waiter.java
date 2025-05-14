package interface_segregation.model;

import interface_segregation.interfaces.OrderTaking;

public class Waiter implements OrderTaking {
    @Override
    public void takeOrder() {
        System.out.println("Müşteriden sipariş alındı. ");
    }
}
