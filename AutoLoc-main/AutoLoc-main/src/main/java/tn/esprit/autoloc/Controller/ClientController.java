// ClientController.java
package tn.esprit.autoloc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Client;
import tn.esprit.autoloc.services.ClientService;

import java.util.List;

@Tag(name = "Gestion des clients", description = "CRUD des clients")
@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @Operation(summary = "AJOUTER CLIENT")
    @PostMapping("/ajouterClient")
    public Client createClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }

    @Operation(summary = "SUPPRIMER CLIENT")
    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @Operation(summary = "RECUPERER CLIENT PAR ID")
    @GetMapping("/getById/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @Operation(summary = "LISTER LES CLIENTS")
    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClient();
    }
}