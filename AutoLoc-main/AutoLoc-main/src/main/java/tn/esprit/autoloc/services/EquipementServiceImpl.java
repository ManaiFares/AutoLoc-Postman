// EquipementServiceImpl.java
package tn.esprit.autoloc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Equipement;
import tn.esprit.autoloc.Repositories.EquipementRepo;

import java.util.List;

@Service
public class EquipementServiceImpl implements EquipementService {

    @Autowired
    private EquipementRepo equipementRepo;

    @Override
    public Equipement saveEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public void deleteEquipement(Long idEquipement) {
        equipementRepo.deleteById(idEquipement);
    }

    @Override
    public Equipement getEquipementById(Long idEquipement) {
        return equipementRepo.findById(idEquipement).orElse(null);
    }

    @Override
    public List<Equipement> getAllEquipement() {
        return equipementRepo.findAll();
    }
}