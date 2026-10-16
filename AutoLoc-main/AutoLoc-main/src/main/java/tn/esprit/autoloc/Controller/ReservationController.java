// ReservationController.java
package tn.esprit.autoloc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Models.Reservation;
import tn.esprit.autoloc.services.ReservationService;

import java.util.List;

@Tag(name = "Gestion des reservations", description = "CRUD des reservations")
@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @Operation(summary = "AJOUTER RESERVATION")
    @PostMapping("/ajouterReservation")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }

    @Operation(summary = "SUPPRIMER RESERVATION")
    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

    @Operation(summary = "RECUPERER RESERVATION PAR ID")
    @GetMapping("/getById/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    @Operation(summary = "LISTER LES RESERVATIONS")
    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservation();
    }
}