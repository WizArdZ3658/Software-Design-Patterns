package org.example;

public class App 
{
    public static void main( String[] args )
    {
        IPaymentGateway p1 = new PayPal();
        System.out.println(p1.checkBalance());
        System.out.println(p1.makePayment(12));

        IPaymentGateway p2 = new StripeAdapter();
        System.out.println(p2.checkBalance());
        System.out.println(p2.makePayment(500));
    }
}
