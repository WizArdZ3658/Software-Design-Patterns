package org.example;

public class PayPal implements IPaymentGateway{

    @Override
    public Integer checkBalance() {
        System.out.println("Checking Balance on PayPal : ");
        return 666;
    }

    @Override
    public boolean makePayment(Integer amount) {
        System.out.println("Making payment of " + amount + " on PayPal");
        return true;
    }
}
