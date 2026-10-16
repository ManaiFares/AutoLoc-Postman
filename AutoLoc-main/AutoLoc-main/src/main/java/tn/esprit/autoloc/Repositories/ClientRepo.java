package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Models.Client;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
