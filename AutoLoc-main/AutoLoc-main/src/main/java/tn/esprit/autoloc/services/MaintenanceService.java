// MaintenanceService.java
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.Models.Maintenance;
import java.util.List;

public interface MaintenanceService {
    Maintenance saveMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long idMaintenance);
    Maintenance getMaintenanceById(Long idMaintenance);
    List<Maintenance> getAllMaintenance();
}