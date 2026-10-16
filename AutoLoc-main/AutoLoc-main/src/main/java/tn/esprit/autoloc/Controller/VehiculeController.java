package tn.esprit.autoloc.controllers;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Vehicule;
import tn.esprit.autoloc.services.VehiculeService;
import tn.esprit.autoloc.services.VehiculeServiceImpl;
import java.util.List;

@Tag(name= "Gestion des vehicules", description = "CRUD des vehicules")

@RestController
@RequestMapping("/vehicules")
public class VehiculeController {

    private final VehiculeServiceImpl vehiculeService;

    public VehiculeController(VehiculeServiceImpl vehiculeService) {
        this.vehiculeService = vehiculeService;
    }
    @Operation(summary = "AJOUTER VEHICULE")
    @PostMapping("/ajouterVehicule")
    public Vehicule createVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.saveVehicule(vehicule);
    }

    @DeleteMapping("/deleteVehicule/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }

    @GetMapping("/getById/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @GetMapping
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicule();
    }
}
