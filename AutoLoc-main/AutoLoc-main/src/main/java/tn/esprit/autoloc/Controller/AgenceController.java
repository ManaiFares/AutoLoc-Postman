// AgenceController.java
package tn.esprit.autoloc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Agence;
import tn.esprit.autoloc.services.AgenceService;

import java.util.List;

@Tag(name = "Gestion des agences", description = "CRUD des agences")
@RestController
@RequestMapping("/agences")
public class AgenceController {

    private final AgenceService agenceService;

    public AgenceController(AgenceService agenceService) {
        this.agenceService = agenceService;
    }

    @Operation(summary = "AJOUTER AGENCE")
    @PostMapping("/ajouterAgence")
    public Agence createAgence(@RequestBody Agence agence) {
        return agenceService.saveAgence(agence);
    }

    @Operation(summary = "SUPPRIMER AGENCE")
    @DeleteMapping("/deleteAgence/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }

    @Operation(summary = "RECUPERER AGENCE PAR ID")
    @GetMapping("/getById/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @Operation(summary = "LISTER LES AGENCES")
    @GetMapping
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgence();
    }
}