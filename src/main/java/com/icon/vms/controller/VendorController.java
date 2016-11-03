package com.icon.vms.controller;

import com.icon.vms.dto.Vendor;
import com.icon.vms.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by A541351 on 10/27/2016.
 */
@RestController
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createVendor(@RequestBody Vendor vendor) {
        vendorService.createVendor(vendor);
    }
}
