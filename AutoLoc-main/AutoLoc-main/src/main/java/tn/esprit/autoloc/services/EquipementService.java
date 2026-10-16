// EquipementService.java
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Equipement;
import java.util.List;

public interface EquipementService {
    Equipement saveEquipement(Equipement equipement);
    void deleteEquipement(Long idEquipement);
    Equipement getEquipementById(Long idEquipement);
    List<Equipement> getAllEquipement();
}