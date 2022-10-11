package org.example;

import org.example.component.Component;
import org.example.component.Composite;
import org.example.component.Leaf;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Component mouse = new Leaf("G402 Mouse", 4000.00);
        Component keyboard = new Leaf("Keyboard", 5000.00);
        Component cpu = new Leaf("CPU", 20000.00);
        Component ram = new Leaf("RAM", 8000.00);
        Component monitor = new Leaf("Dell Monitor", 12000.00);
        Component hdd = new Leaf("HDD", 3000.00);
        Component gpu = new Leaf("GPU", 25000.00);

        Composite peripherals = new Composite("Peripherals");
        peripherals.addComponent(mouse);
        peripherals.addComponent(keyboard);

        Composite motherboard = new Composite("ASUS ROG Motherboard");
        motherboard.addComponent(cpu);
        motherboard.addComponent(ram);
        motherboard.addComponent(gpu);

        Composite cabinet = new Composite("Corsair Cabinet");
        cabinet.addComponent(motherboard);
        cabinet.addComponent(hdd);

        Composite computer = new Composite("Alienware Desktop");
        computer.addComponent(peripherals);
        computer.addComponent(cabinet);
        computer.addComponent(peripherals);

        computer.showPrice();
    }
}
