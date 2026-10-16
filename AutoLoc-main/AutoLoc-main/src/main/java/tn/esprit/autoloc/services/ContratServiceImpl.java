// ContratServiceImpl.java
package tn.esprit.autoloc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Contrat;
import tn.esprit.autoloc.Repositories.ContratRepo;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratService {

    @Autowired
    private ContratRepo contratRepo;

    @Override
    public Contrat saveContrat(Contrat contrat) {
        return contratRepo.save(contrat);
    }

    @Override
    public void deleteContrat(Long idContrat) {
        contratRepo.deleteById(idContrat);
    }

    @Override
    public Contrat getContratById(Long idContrat) {
        return contratRepo.findById(idContrat).orElse(null);
    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepo.findAll();
    }
}