package org.example.responsibilities.implementations;

import org.example.models.ContextData;
import org.example.responsibilities.BaseResponsibility;

public class AddIdResponsibility extends BaseResponsibility {

    @Override
    public void performResponsibility(ContextData contextData) {
        System.out.println("added name");
        contextData.setId(123);
        this.processNextResponsibility(contextData);
    }
}
