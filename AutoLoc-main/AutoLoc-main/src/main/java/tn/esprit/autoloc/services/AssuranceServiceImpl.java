// AssuranceServiceImpl.java
package tn.esprit.autoloc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Assurance;
import tn.esprit.autoloc.Repositories.AssuranceRepo;

import java.util.List;

@Service
public class AssuranceServiceImpl implements AssuranceService {

    @Autowired
    private AssuranceRepo assuranceRepo;

    @Override
    public Assurance saveAssurance(Assurance assurance) {
        return assuranceRepo.save(assurance);
    }

    @Override
    public void deleteAssurance(Long idAssurance) {
        assuranceRepo.deleteById(idAssurance);
    }

    @Override
    public Assurance getAssuranceById(Long idAssurance) {
        return assuranceRepo.findById(idAssurance).orElse(null);
    }

    @Override
    public List<Assurance> getAllAssurance() {
        return assuranceRepo.findAll();
    }
}