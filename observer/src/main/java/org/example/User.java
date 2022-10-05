package org.example;

public class User implements IConsumer {
    private Integer userId;

    public User(Integer id) {
        this.userId = id;
    }

    @Override
    public void notify(String message) {
        System.out.println(message + " " + this.userId);
    }
}
