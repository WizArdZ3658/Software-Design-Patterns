package org.example;

public interface IFlies {
    public String tryToFly();
}

class CanFly implements IFlies {

    @Override
    public String tryToFly() {
        return "Flying High";
    }
}

class CantFly implements IFlies {

    @Override
    public String tryToFly() {
        return "Can't fly";
    }
}