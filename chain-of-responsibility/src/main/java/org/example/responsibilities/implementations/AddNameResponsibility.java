package org.example.responsibilities.implementations;

import org.example.models.ContextData;
import org.example.responsibilities.BaseResponsibility;

public class AddNameResponsibility extends BaseResponsibility {

    @Override
    public void performResponsibility(ContextData contextData) {
        System.out.println("added name");
        contextData.setName("Jack");
        this.processNextResponsibility(contextData);
    }
}
