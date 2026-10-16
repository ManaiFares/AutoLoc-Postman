// PaiementController.java
package tn.esprit.autoloc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Paiement;
import tn.esprit.autoloc.services.PaiementService;

import java.util.List;

@Tag(name = "Gestion des paiements", description = "CRUD des paiements")
@RestController
@RequestMapping("/paiements")
public class PaiementController {

    private final PaiementService paiementService;

    public PaiementController(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    @Operation(summary = "AJOUTER PAIEMENT")
    @PostMapping("/ajouterPaiement")
    public Paiement createPaiement(@RequestBody Paiement paiement) {
        return paiementService.savePaiement(paiement);
    }

    @Operation(summary = "SUPPRIMER PAIEMENT")
    @DeleteMapping("/deletePaiement/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }

    @Operation(summary = "RECUPERER PAIEMENT PAR ID")
    @GetMapping("/getById/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    @Operation(summary = "LISTER LES PAIEMENTS")
    @GetMapping
    public List<Paiement> getAllPaiements() {
        return paiementService.getAllPaiement();
    }
}