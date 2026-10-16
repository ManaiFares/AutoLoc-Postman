// ClientServiceImpl.java
package tn.esprit.autoloc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Client;
import tn.esprit.autoloc.Repositories.ClientRepo;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Override
    public Client saveClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public void deleteClient(Long idClient) {
        clientRepo.deleteById(idClient);
    }

    @Override
    public Client getClientById(Long idClient) {
        return clientRepo.findById(idClient).orElse(null);
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepo.findAll();
    }
}