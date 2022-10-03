package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        Animal animal1 = new Dog();
        System.out.println(animal1.toString());
        animal1.tryToFly();

        Animal animal2 = new Bird();
        System.out.println(animal2.toString());
        animal2.tryToFly();
    }
}
