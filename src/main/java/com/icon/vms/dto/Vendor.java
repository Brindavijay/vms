package com.icon.vms.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by A541351 on 10/27/2016.
 */
@Entity
@Table(name="vendors")
public class Vendor implements Serializable{

    @Id
    private long id;

    @Column(name="vendor_name")
    private String vendorName;

    @Column(name="short_description")
    private String shortDesc;


    @Column(name="long_description")
    private String longDesc;

    @Column(name="license_terms")
    private String terms;

    @Column(name="activation_date")
    private Date activationDt;

    @Column(name="deactivation_date")
    private Date deactivationDt;

    @Column(name="create_by")
    private String createBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public Date getActivationDt() {
        return activationDt;
    }

    public void setActivationDt(Date activationDt) {
        this.activationDt = activationDt;
    }

    public Date getDeactivationDt() {
        return deactivationDt;
    }

    public void setDeactivationDt(Date deactivationDt) {
        this.deactivationDt = deactivationDt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
