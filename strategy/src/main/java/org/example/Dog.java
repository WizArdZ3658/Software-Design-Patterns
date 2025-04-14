package org.example;

public class Dog extends Animal{

    public Dog() {
        this.setName("Dog");
        this.setFlyObj(new CantFly());
    }
}
