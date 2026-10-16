// EmployeService.java
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Employe;
import java.util.List;

public interface EmployeService {
    Employe saveEmploye(Employe employe);
    void deleteEmploye(Long idEmploye);
    Employe getEmployeById(Long idEmploye);
    List<Employe> getAllEmploye();
}