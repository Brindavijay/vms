package com.icon.vms.service;

import com.icon.vms.dao.VendorDao;
import com.icon.vms.dto.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by A541351 on 10/27/2016.
 */
@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorDao vendorDao;

    @Override
    public void createVendor(Vendor vendor) {
        vendorDao.save(vendor);
    }
}
