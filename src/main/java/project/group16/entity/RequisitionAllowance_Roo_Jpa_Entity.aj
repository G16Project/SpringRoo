// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package project.group16.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import project.group16.entity.RequisitionAllowance;

privileged aspect RequisitionAllowance_Roo_Jpa_Entity {
    
    declare @type: RequisitionAllowance: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long RequisitionAllowance.id;
    
    @Version
    @Column(name = "version")
    private Integer RequisitionAllowance.version;
    
    public Long RequisitionAllowance.getId() {
        return this.id;
    }
    
    public void RequisitionAllowance.setId(Long id) {
        this.id = id;
    }
    
    public Integer RequisitionAllowance.getVersion() {
        return this.version;
    }
    
    public void RequisitionAllowance.setVersion(Integer version) {
        this.version = version;
    }
    
}