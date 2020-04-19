package com.household.appliance.services;

import com.household.appliance.entities.Appliance;
import com.household.appliance.repositories.ApplianceRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Appliance service implement.
 */
@Service
public class ApplianceServiceImpl implements ApplianceService {

    private ApplianceRepository applianceRepository;

    @Autowired
    public void setApplianceRepository(ApplianceRepository applianceRepository) {
        this.applianceRepository = applianceRepository;
    }

    @Override
    public Iterable<Appliance> listAllAppliances() {
        return applianceRepository.findAll();
    }

    @Override
    public Appliance getApplianceById(Integer id) {
        return applianceRepository.findOne(id);
    }

    @Override
    public Appliance saveAppliance(Appliance appliance) {
        return applianceRepository.save(appliance);
    }

    @Override
    public void deleteAppliance(Integer id) {
        applianceRepository.delete(id);
    }

}
