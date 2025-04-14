package org.example;

public interface IPaymentGateway {

    public Integer checkBalance();

    public boolean makePayment(Integer amount);

}
