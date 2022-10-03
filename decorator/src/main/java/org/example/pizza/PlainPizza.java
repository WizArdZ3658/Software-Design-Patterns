package org.example.pizza;

public class PlainPizza implements Pizza{

    @Override
    public double getCost() {
        System.out.println("Cost of Dough: " + 4.00);
        return 4.00;
    }

    @Override
    public String getDescription() {
        return "Thin dough";
    }
}
