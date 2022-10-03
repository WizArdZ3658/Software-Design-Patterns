package org.example;

import org.example.pizza.Pizza;
import org.example.pizza.PlainPizza;
import org.example.toppings.Mozzarella;
import org.example.toppings.TomatoSauce;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());
    }
}
