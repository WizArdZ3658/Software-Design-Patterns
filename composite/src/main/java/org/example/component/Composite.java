package org.example.component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private final String name;
    private final List<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component component : componentList) {
            component.showPrice();
        }
        System.out.println();
    }
}
