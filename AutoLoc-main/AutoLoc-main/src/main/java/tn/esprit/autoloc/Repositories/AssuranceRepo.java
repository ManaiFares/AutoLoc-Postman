package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Models.Assurance;

public interface AssuranceRepo extends JpaRepository<Assurance, Long> {
}
