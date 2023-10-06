package ar.edu.unnoba.poo2023.service;

import ar.edu.unnoba.poo2023.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClientService {
    public void create(Client client);
    public List<Client> getClients();
    public Client getClientByTaxID(String taxID);
}
