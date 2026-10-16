// ClientService.java
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Client;
import java.util.List;

public interface ClientService {
    Client saveClient(Client client);
    void deleteClient(Long idClient);
    Client getClientById(Long idClient);
    List<Client> getAllClient();
}