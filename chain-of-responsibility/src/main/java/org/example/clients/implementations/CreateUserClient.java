package org.example.clients.implementations;

import org.example.clients.Client;
import org.example.models.ContextData;
import org.example.responsibilities.BaseResponsibility;
import org.example.responsibilities.implementations.AddAgeResponsibility;
import org.example.responsibilities.implementations.AddIdResponsibility;
import org.example.responsibilities.implementations.AddNameResponsibility;


public class CreateUserClient extends Client {

    public CreateUserClient() {
        this.initializeResponsibilities();
    }

    @Override
    public void initializeResponsibilities() {
        BaseResponsibility resp1 = new AddNameResponsibility();
        BaseResponsibility resp2 = new AddAgeResponsibility();
        BaseResponsibility resp3 = new AddIdResponsibility();

        resp1.setNextResponsibility(resp2);
        resp2.setNextResponsibility(resp3);
        this.setFirstResponsibility(resp1);
    }
}
