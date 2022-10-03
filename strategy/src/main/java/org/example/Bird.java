package org.example;

public class Bird extends Animal {
    public Bird() {
        this.setName("Bird");
        this.setFlyObj(new CanFly());
    }
}
