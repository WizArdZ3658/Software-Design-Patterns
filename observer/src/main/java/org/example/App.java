package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Group group1 = new Group();

        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);

        group1.subscribe(user1);
        group1.subscribe(user2);
        group1.subscribe(user3);

        group1.notify("Hello there");

        group1.unsubscribe(user2);

        group1.notify("Removed user1 from the chat");
    }
}
