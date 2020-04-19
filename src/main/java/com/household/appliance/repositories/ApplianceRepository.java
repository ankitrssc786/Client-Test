package com.household.appliance.repositories;

import org.springframework.data.repository.CrudRepository;

import com.household.appliance.entities.Appliance;

public interface ApplianceRepository extends CrudRepository<Appliance, Integer> {

}
