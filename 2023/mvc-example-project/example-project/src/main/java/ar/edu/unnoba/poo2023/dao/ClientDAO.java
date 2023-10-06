package ar.edu.unnoba.poo2023.dao;

import ar.edu.unnoba.poo2023.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO {
    public List<Client> clients;

    public ClientDAO(){
        clients = new ArrayList<>();
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public List<Client> getClients(){
        return clients;
    }
    public Client getClientByTaxID(String taxID){
        return this.getClients().stream()
                .filter((Client client) -> {
                    return client.getTaxID().equals(taxID);
                }).findFirst().get();
    }
}
