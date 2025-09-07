package org.example.clients;

import org.example.models.ContextData;
import org.example.responsibilities.BaseResponsibility;

public abstract class Client {

    private BaseResponsibility firstResponsibility;

    public abstract void initializeResponsibilities();
    public void startClientOperation(ContextData contextData) {
        this.firstResponsibility.performResponsibility(contextData);
    }

    protected void setFirstResponsibility(BaseResponsibility resp) {
        this.firstResponsibility = resp;
    }

}
