package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Models.Equipement;

public interface EquipementRepo extends JpaRepository<Equipement, Long> {
}
