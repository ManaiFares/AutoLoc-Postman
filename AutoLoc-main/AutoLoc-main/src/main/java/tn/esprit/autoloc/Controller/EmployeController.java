// EmployeController.java
package tn.esprit.autoloc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Employe;
import tn.esprit.autoloc.services.EmployeService;

import java.util.List;

@Tag(name = "Gestion des employes", description = "CRUD des employes")
@RestController
@RequestMapping("/employes")
public class EmployeController {

    private final EmployeService employeService;

    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }

    @Operation(summary = "AJOUTER EMPLOYE")
    @PostMapping("/ajouterEmploye")
    public Employe createEmploye(@RequestBody Employe employe) {
        return employeService.saveEmploye(employe);
    }

    @Operation(summary = "SUPPRIMER EMPLOYE")
    @DeleteMapping("/deleteEmploye/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }

    @Operation(summary = "RECUPERER EMPLOYE PAR ID")
    @GetMapping("/getById/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeService.getEmployeById(id);
    }

    @Operation(summary = "LISTER LES EMPLOYES")
    @GetMapping
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmploye();
    }
}