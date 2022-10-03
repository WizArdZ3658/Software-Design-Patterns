package org.example;

public class Stripe {

    public Integer validate() {
        System.out.println("Checking Balance on Stripe : ");
        return 46;
    }

    public boolean pay(Integer amount) {
        System.out.println("Making payment of " + amount + " on Stripe");
        return true;
    }
}
