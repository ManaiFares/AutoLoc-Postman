// AgenceServiceImpl.java
package tn.esprit.autoloc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Agence;
import tn.esprit.autoloc.Repositories.AgenceRepo;

import java.util.List;

@Service
public class AgenceServiceImpl implements AgenceService {

    @Autowired
    private AgenceRepo agenceRepo;

    @Override
    public Agence saveAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public void deleteAgence(Long idAgence) {
        agenceRepo.deleteById(idAgence);
    }

    @Override
    public Agence getAgenceById(Long idAgence) {
        return agenceRepo.findById(idAgence).orElse(null);
    }

    @Override
    public List<Agence> getAllAgence() {
        return agenceRepo.findAll();
    }
}