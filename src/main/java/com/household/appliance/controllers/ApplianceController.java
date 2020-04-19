package com.household.appliance.controllers;

import com.household.appliance.entities.Appliance;
import com.household.appliance.services.ApplianceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Appliance controller.
 */
@Controller
public class ApplianceController {

    private ApplianceService applianceService;

    @Autowired
    public void setApplianceService(ApplianceService applianceService) {
        this.applianceService = applianceService;
    }

    /**
     * List all appliances.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/appliances", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("appliances", applianceService.listAllAppliances());
        System.out.println("Returning appliances:");
        return "appliances";
    }

    /**
     * View a specific appliance by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("appliance/{id}")
    public String showApplianceByKey(@PathVariable Integer id, Model model) {
        model.addAttribute("appliance", applianceService.getApplianceById(id));
        return "applianceshow";
    }

    // Edit Appliance
    @RequestMapping("appliance/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("appliance", applianceService.getApplianceById(id));
        return "applianceform";
    }

    /**
     * Save appliance to database.
     *
     * @param appliance
     * @return
     */
    @RequestMapping(value = "appliance", method = RequestMethod.POST)
    public String saveAppliance(Appliance appliance) {
    	applianceService.saveAppliance(appliance);
        return "redirect:/appliance/" + appliance.getSerialNumber();
    }

    /**
     * Delete appliance by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("appliance/delete/{id}")
    public String delete(@PathVariable Integer id) {
    	applianceService.deleteAppliance(id);
        return "redirect:/appliances";
    }

}
