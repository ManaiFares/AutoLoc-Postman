// MaintenanceController.java
package tn.esprit.autoloc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Maintenance;
import tn.esprit.autoloc.services.MaintenanceService;

import java.util.List;

@Tag(name = "Gestion des maintenances", description = "CRUD des maintenances")
@RestController
@RequestMapping("/maintenances")
public class MaintenanceController {

    private final MaintenanceService maintenanceService;

    public MaintenanceController(MaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    @Operation(summary = "AJOUTER MAINTENANCE")
    @PostMapping("/ajouterMaintenance")
    public Maintenance createMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.saveMaintenance(maintenance);
    }

    @Operation(summary = "SUPPRIMER MAINTENANCE")
    @DeleteMapping("/deleteMaintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }

    @Operation(summary = "RECUPERER MAINTENANCE PAR ID")
    @GetMapping("/getById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.getMaintenanceById(id);
    }

    @Operation(summary = "LISTER LES MAINTENANCES")
    @GetMapping
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenance();
    }
}