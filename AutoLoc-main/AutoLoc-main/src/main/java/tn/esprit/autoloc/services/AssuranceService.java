// AssuranceService.java
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Assurance;
import java.util.List;

public interface AssuranceService {
    Assurance saveAssurance(Assurance assurance);
    void deleteAssurance(Long idAssurance);
    Assurance getAssuranceById(Long idAssurance);
    List<Assurance> getAllAssurance();
}