package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Models.Contrat;

public interface ContratRepo extends JpaRepository<Contrat, Long> {
}
