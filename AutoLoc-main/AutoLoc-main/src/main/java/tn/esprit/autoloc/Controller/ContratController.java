// ContratController.java
package tn.esprit.autoloc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Contrat;
import tn.esprit.autoloc.services.ContratService;

import java.util.List;

@Tag(name = "Gestion des contrats", description = "CRUD des contrats")
@RestController
@RequestMapping("/contrats")
public class ContratController {

    private final ContratService contratService;

    public ContratController(ContratService contratService) {
        this.contratService = contratService;
    }

    @Operation(summary = "AJOUTER CONTRAT")
    @PostMapping("/ajouterContrat")
    public Contrat createContrat(@RequestBody Contrat contrat) {
        return contratService.saveContrat(contrat);
    }

    @Operation(summary = "SUPPRIMER CONTRAT")
    @DeleteMapping("/deleteContrat/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }

    @Operation(summary = "RECUPERER CONTRAT PAR ID")
    @GetMapping("/getById/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.getContratById(id);
    }

    @Operation(summary = "LISTER LES CONTRATS")
    @GetMapping
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrat();
    }
}