package ar.edu.unnoba.poo2023.service;

import ar.edu.unnoba.poo2023.dao.ClientDAO;
import ar.edu.unnoba.poo2023.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService{
    @Autowired
    private ClientDAO clientDAO;
    @Override
    public void create(Client client) {
        clientDAO.addClient(client);
    }
    @Override
    public List<Client> getClients() {
        return clientDAO.getClients();
    }

    @Override
    public Client getClientByTaxID(String taxID) {
        return clientDAO.getClientByTaxID(taxID);
    }
}
