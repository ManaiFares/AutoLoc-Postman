// ReservationService.java
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Reservation;
import java.util.List;

public interface ReservationService {
    Reservation saveReservation(Reservation reservation);
    void deleteReservation(Long idReservation);
    Reservation getReservationById(Long idReservation);
    List<Reservation> getAllReservation();
}