package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Models.Employe;

public interface EmployeRepo extends JpaRepository <Employe, Long> {
}
