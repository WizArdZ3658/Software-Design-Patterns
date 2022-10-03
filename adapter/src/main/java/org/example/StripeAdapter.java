package org.example;

public class StripeAdapter implements IPaymentGateway{
    private static Stripe stripeObj = new Stripe();

    @Override
    public Integer checkBalance() {
        return stripeObj.validate();
    }

    @Override
    public boolean makePayment(Integer amount) {
        return stripeObj.pay(amount);
    }
}
