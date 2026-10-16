// PaiementService.java
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Paiement;
import java.util.List;

public interface PaiementService {
    Paiement savePaiement(Paiement paiement);
    void deletePaiement(Long idPaiement);
    Paiement getPaiementById(Long idPaiement);
    List<Paiement> getAllPaiement();
}