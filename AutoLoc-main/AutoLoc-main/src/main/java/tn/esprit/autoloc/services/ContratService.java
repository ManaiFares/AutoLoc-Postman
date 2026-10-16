// ContratService.java
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Contrat;
import java.util.List;

public interface ContratService {
    Contrat saveContrat(Contrat contrat);
    void deleteContrat(Long idContrat);
    Contrat getContratById(Long idContrat);
    List<Contrat> getAllContrat();
}