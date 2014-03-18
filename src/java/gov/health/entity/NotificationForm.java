/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.health.entity;

import gov.health.data.Ethnicity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author pdhs
 */
@Entity
public class NotificationForm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    Person infant;
    @ManyToOne(cascade = CascadeType.ALL)
    Person mother;
    @ManyToOne
    Person inSex;
    //@Enumerated(EnumType.STRING)
    @ManyToOne
    Institution hospital;
    @ManyToOne
    Department ward;
    @ManyToOne
    Area district;
    @ManyToOne
    Area rdhsArea;
    @ManyToOne
    Area mohArea;
    @ManyToOne
    Area gnArea;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date caseIdentifiedDate;
    int bhtNo;
    Boolean aliveOrDead;
    String diagnosis;
    String motherName;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date motherDoB;
    int age;
    String nic;
    String address;
    String tp1;
    String tp2;
    @ManyToOne
    Person infantDod; // infant date of death
    Long infantAodYrs; // infant age of death by year
    Long infantAodMnths; // infant age of death by year
    Long infantAodDys; // infant age of death by year
    String placeOfDead;
    boolean postMortem; // yes or no
    @ManyToOne
    Person nameOfJmo;
    String underlyingCause; // Causes of death
    String immediateCause; // Causes of death
    String conDeath; // Conditions contributing to Death
    @ManyToOne
    Person informant; // imformant name
    @ManyToOne
    Designation imDesignation; // imformant designation
    String inTp; // informant telephone
    @ManyToOne
    Person nameHOI; // Head of the institutions' name
    @Temporal(javax.persistence.TemporalType.DATE)
    Date approveDate; // by head of the institution

    public boolean isPostMortem() {
        return postMortem;
    }

    public void setPostMortem(boolean postMortem) {
        this.postMortem = postMortem;
    }

    
    
    public String getInTp() {
        return inTp;
    }

    public void setInTp(String inTp) {
        this.inTp = inTp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaceOfDead() {
        return placeOfDead;
    }

    public void setPlaceOfDead(String placeOfDead) {
        this.placeOfDead = placeOfDead;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotificationForm)) {
            return false;
        }
        NotificationForm other = (NotificationForm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gov.health.entity.NotificationForm[ id=" + id + " ]";
    }

    public Person getInfant() {
        return infant;
    }

    public void setInfant(Person infant) {
        this.infant = infant;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getInSex() {
        return inSex;
    }

    public void setInSex(Person inSex) {
        this.inSex = inSex;
    }

    public Institution getHospital() {
        return hospital;
    }

    public void setHospital(Institution hospital) {
        this.hospital = hospital;
    }

    public Department getWard() {
        return ward;
    }

    public void setWard(Department ward) {
        this.ward = ward;
    }

    public Area getDistrict() {
        return district;
    }

    public void setDistrict(Area district) {
        this.district = district;
    }

    public Area getRdhsArea() {
        return rdhsArea;
    }

    public void setRdhsArea(Area rdhsArea) {
        this.rdhsArea = rdhsArea;
    }

    public Area getMohArea() {
        return mohArea;
    }

    public void setMohArea(Area mohArea) {
        this.mohArea = mohArea;
    }

    public Area getGnArea() {
        return gnArea;
    }

    public void setGnArea(Area gnArea) {
        this.gnArea = gnArea;
    }

    public Date getCaseIdentifiedDate() {
        return caseIdentifiedDate;
    }

    public void setCaseIdentifiedDate(Date caseIdentifiedDate) {
        this.caseIdentifiedDate = caseIdentifiedDate;
    }

    public int getBhtNo() {
        return bhtNo;
    }

    public void setBhtNo(int bhtNo) {
        this.bhtNo = bhtNo;
    }

    public Boolean isAliveOrDead() {
        return aliveOrDead;
    }

    public void setAliveOrDead(Boolean aliveOrDead) {
        this.aliveOrDead = aliveOrDead;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Date getMotherDoB() {
        return motherDoB;
    }

    public void setMotherDoB(Date motherDoB) {
        this.motherDoB = motherDoB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTp1() {
        return tp1;
    }

    public void setTp1(String tp1) {
        this.tp1 = tp1;
    }

    public String getTp2() {
        return tp2;
    }

    public void setTp2(String tp2) {
        this.tp2 = tp2;
    }
    
    
    public Person getInfantDod() {
        return infantDod;
    }

    public void setInfantDod(Person infantDod) {
        this.infantDod = infantDod;
    }

    public Long getInfantAodYrs() {
        return infantAodYrs;
    }

    public void setInfantAodYrs(Long infantAodYrs) {
        this.infantAodYrs = infantAodYrs;
    }

    public Long getInfantAodMnths() {
        return infantAodMnths;
    }

    public void setInfantAodMnths(Long infantAodMnths) {
        this.infantAodMnths = infantAodMnths;
    }

    public Long getInfantAodDys() {
        return infantAodDys;
    }

    public void setInfantAodDys(Long infantAodDys) {
        this.infantAodDys = infantAodDys;
    }

    public Person getNameOfJmo() {
        return nameOfJmo;
    }

    public void setNameOfJmo(Person nameOfJmo) {
        this.nameOfJmo = nameOfJmo;
    }

    public String getUnderlyingCause() {
        return underlyingCause;
    }

    public void setUnderlyingCause(String underlyingCause) {
        this.underlyingCause = underlyingCause;
    }

    public String getImmediateCause() {
        return immediateCause;
    }

    public void setImmediateCause(String immediateCause) {
        this.immediateCause = immediateCause;
    }

    public String getConDeath() {
        return conDeath;
    }

    public void setConDeath(String conDeath) {
        this.conDeath = conDeath;
    }

    public Person getInformant() {
        return informant;
    }

    public void setInformant(Person informant) {
        this.informant = informant;
    }

    public Designation getImDesignation() {
        return imDesignation;
    }

    public void setImDesignation(Designation imDesignation) {
        this.imDesignation = imDesignation;
    }

    public Person getNameHOI() {
        return nameHOI;
    }

    public void setNameHOI(Person nameHOI) {
        this.nameHOI = nameHOI;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public NotificationForm() {
    }
    
    
}
