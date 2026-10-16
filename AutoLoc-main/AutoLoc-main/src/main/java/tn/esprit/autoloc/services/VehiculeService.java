package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Vehicule;

import java.util.List;

public interface VehiculeService {

    Vehicule saveVehicule(Vehicule vehicule);

    void deleteVehicule(Long idVehicule);
    Vehicule getVehiculeById(Long idVehicule);

    List<Vehicule> getAllVehicule();
}
