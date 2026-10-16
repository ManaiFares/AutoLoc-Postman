// EquipementController.java
package tn.esprit.autoloc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Equipement;
import tn.esprit.autoloc.services.EquipementService;

import java.util.List;

@Tag(name = "Gestion des equipements", description = "CRUD des equipements")
@RestController
@RequestMapping("/equipements")
public class EquipementController {

    private final EquipementService equipementService;

    public EquipementController(EquipementService equipementService) {
        this.equipementService = equipementService;
    }

    @Operation(summary = "AJOUTER EQUIPEMENT")
    @PostMapping("/ajouterEquipement")
    public Equipement createEquipement(@RequestBody Equipement equipement) {
        return equipementService.saveEquipement(equipement);
    }

    @Operation(summary = "SUPPRIMER EQUIPEMENT")
    @DeleteMapping("/deleteEquipement/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }

    @Operation(summary = "RECUPERER EQUIPEMENT PAR ID")
    @GetMapping("/getById/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementService.getEquipementById(id);
    }

    @Operation(summary = "LISTER LES EQUIPEMENTS")
    @GetMapping
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipement();
    }
}