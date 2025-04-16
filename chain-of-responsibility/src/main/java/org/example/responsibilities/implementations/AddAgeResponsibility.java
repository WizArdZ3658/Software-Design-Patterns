package org.example.responsibilities.implementations;

import org.example.models.ContextData;
import org.example.responsibilities.BaseResponsibility;

import java.util.Date;

public class AddAgeResponsibility extends BaseResponsibility {

    @Override
    public void performResponsibility(ContextData contextData) {
        System.out.println("added age");
        Date date = new Date();
        contextData.setDateOfBirth(date);
        this.processNextResponsibility(contextData);
    }
}
