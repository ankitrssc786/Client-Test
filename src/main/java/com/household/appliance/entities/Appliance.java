package com.household.appliance.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Appliance entity.
 */
@Entity
@Table(name = "appliance")
public class Appliance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer serialNumber;
	private String brand;
	private String model;
	private String status;
	private Date dateBought;

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateBought() {
		return dateBought;
	}

	public void setDateBought(Date dateBought) {
		this.dateBought = dateBought;
	}

	@Override
	public String toString() {
		return "Appliance [serialNumber=" + serialNumber + ", brand=" + brand + ", model=" + model + ", status="
				+ status + ", dateBought=" + dateBought + "]";
	}

}
