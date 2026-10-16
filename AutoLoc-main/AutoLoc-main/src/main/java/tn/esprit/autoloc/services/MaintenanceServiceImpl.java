// MaintenanceServiceImpl.java
package tn.esprit.autoloc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Models.Maintenance;
import tn.esprit.autoloc.Repositories.MaintenanceRepo;

import java.util.List;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    @Autowired
    private MaintenanceRepo maintenanceRepo;

    @Override
    public Maintenance saveMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }

    @Override
    public void deleteMaintenance(Long idMaintenance) {
        maintenanceRepo.deleteById(idMaintenance);
    }

    @Override
    public Maintenance getMaintenanceById(Long idMaintenance) {
        return maintenanceRepo.findById(idMaintenance).orElse(null);
    }

    @Override
    public List<Maintenance> getAllMaintenance() {
        return maintenanceRepo.findAll();
    }
}