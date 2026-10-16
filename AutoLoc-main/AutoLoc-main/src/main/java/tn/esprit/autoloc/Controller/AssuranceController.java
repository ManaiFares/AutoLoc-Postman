// AssuranceController.java
package tn.esprit.autoloc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Assurance;
import tn.esprit.autoloc.services.AssuranceService;

import java.util.List;

@Tag(name = "Gestion des assurances", description = "CRUD des assurances")
@RestController
@RequestMapping("/assurances")
public class AssuranceController {

    private final AssuranceService assuranceService;

    public AssuranceController(AssuranceService assuranceService) {
        this.assuranceService = assuranceService;
    }

    @Operation(summary = "AJOUTER ASSURANCE")
    @PostMapping("/ajouterAssurance")
    public Assurance createAssurance(@RequestBody Assurance assurance) {
        return assuranceService.saveAssurance(assurance);
    }

    @Operation(summary = "SUPPRIMER ASSURANCE")
    @DeleteMapping("/deleteAssurance/{id}")
    public void deleteAssurance(@PathVariable Long id) {
        assuranceService.deleteAssurance(id);
    }

    @Operation(summary = "RECUPERER ASSURANCE PAR ID")
    @GetMapping("/getById/{id}")
    public Assurance getAssuranceById(@PathVariable Long id) {
        return assuranceService.getAssuranceById(id);
    }

    @Operation(summary = "LISTER LES ASSURANCES")
    @GetMapping
    public List<Assurance> getAllAssurances() {
        return assuranceService.getAllAssurance();
    }
}