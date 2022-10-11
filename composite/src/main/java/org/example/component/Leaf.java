package org.example.component;

public class Leaf implements Component{
    private final String name;
    private final Double price;

    public Leaf(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }
}
