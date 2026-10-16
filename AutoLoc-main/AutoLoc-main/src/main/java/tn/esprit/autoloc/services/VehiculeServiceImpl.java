package tn.esprit.autoloc.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Vehicule;
import tn.esprit.autoloc.Repositories.VehiculeRepo;
import java.util.List;
@Service
public class VehiculeServiceImpl implements VehiculeService {
    @Autowired
    private VehiculeRepo vehiculeRepo;
    @Override
    public Vehicule saveVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }
    @Override
    public void deleteVehicule(Long idVehicule) {
        vehiculeRepo.deleteById(idVehicule);
    }
    @Override
    public Vehicule getVehiculeById(Long idVehicule) {
        return vehiculeRepo.findById(idVehicule).get();
    }
    @Override
    public List<Vehicule> getAllVehicule() {
        return vehiculeRepo.findAll();
    }
}
