// ReservationServiceImpl.java
package tn.esprit.autoloc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Reservation;
import tn.esprit.autoloc.Repositories.ReservationRepo;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepo reservationRepo;

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public void deleteReservation(Long idReservation) {
        reservationRepo.deleteById(idReservation);
    }

    @Override
    public Reservation getReservationById(Long idReservation) {
        return reservationRepo.findById(idReservation).orElse(null);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepo.findAll();
    }
}