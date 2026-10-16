package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.Models.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {
}
