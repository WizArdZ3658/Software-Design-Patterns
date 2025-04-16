package org.example.clients;

import org.example.models.ContextData;

public interface Client {

    void initializeResponsibilities();
    void startClientOperation(ContextData contextData);

}
