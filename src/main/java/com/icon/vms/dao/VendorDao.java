package com.icon.vms.dao;

import com.icon.vms.dto.Vendor;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by A541351 on 10/27/2016.
 */
@Transactional
public interface VendorDao  extends CrudRepository<Vendor, Long> {

    public Vendor findByVendorName(String vendorName);
}
