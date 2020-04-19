package com.household.appliance.services;

import com.household.appliance.entities.Appliance;

public interface ApplianceService {

    Iterable<Appliance> listAllAppliances();
    
    Appliance getApplianceById(Integer id);

    Appliance saveAppliance(Appliance appliance);

    void deleteAppliance(Integer id);

}
