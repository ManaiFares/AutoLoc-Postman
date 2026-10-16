// EmployeServiceImpl.java
package tn.esprit.autoloc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Employe;
import tn.esprit.autoloc.Repositories.EmployeRepo;

import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    private EmployeRepo employeRepo;

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRepo.save(employe);
    }

    @Override
    public void deleteEmploye(Long idEmploye) {
        employeRepo.deleteById(idEmploye);
    }

    @Override
    public Employe getEmployeById(Long idEmploye) {
        return employeRepo.findById(idEmploye).orElse(null);
    }

    @Override
    public List<Employe> getAllEmploye() {
        return employeRepo.findAll();
    }
}