// AgenceService.java
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Agence;
import java.util.List;

public interface AgenceService {
    Agence saveAgence(Agence agence);
    void deleteAgence(Long idAgence);
    Agence getAgenceById(Long idAgence);
    List<Agence> getAllAgence();
}