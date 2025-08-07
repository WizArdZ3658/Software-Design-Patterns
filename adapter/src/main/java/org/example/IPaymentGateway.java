package org.example;

public interface IPaymentGateway {

    Integer checkBalance();

    boolean makePayment(Integer amount);

}
