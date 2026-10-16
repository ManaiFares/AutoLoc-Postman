// PaiementServiceImpl.java
package tn.esprit.autoloc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Paiement;
import tn.esprit.autoloc.Repositories.PaiementRepo;

import java.util.List;

@Service
public class PaiementServiceImpl implements PaiementService {

    @Autowired
    private PaiementRepo paiementRepo;

    @Override
    public Paiement savePaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }

    @Override
    public void deletePaiement(Long idPaiement) {
        paiementRepo.deleteById(idPaiement);
    }

    @Override
    public Paiement getPaiementById(Long idPaiement) {
        return paiementRepo.findById(idPaiement).orElse(null);
    }

    @Override
    public List<Paiement> getAllPaiement() {
        return paiementRepo.findAll();
    }
}