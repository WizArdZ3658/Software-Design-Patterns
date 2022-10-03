package org.example;

import lombok.Data;

@Data
public abstract class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;
    private IFlies flyObj;


    public void tryToFly() {
        System.out.println("Let's see if I can fly : " + flyObj.tryToFly());
    }
}
