package org.example;

import org.example.clients.Client;
import org.example.clients.implementations.CreateUserClient;
import org.example.models.ContextData;

public class Main {
    public static void main(String[] args) {
        ContextData contextData = new ContextData();
        Client client1 = new CreateUserClient();
        client1.startClientOperation(contextData);
        System.out.println(contextData);
    }
}