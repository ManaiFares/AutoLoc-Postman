package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Models.Paiement;

public interface PaiementRepo extends JpaRepository<Paiement, Long> {
}
