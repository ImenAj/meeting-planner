package com.test.meetingplanner.model;

public class Materiel {

    Integer id;
    TypeMateriel typeMateriel;
    Boolean mobile;

    public Materiel() {
    }

    public Materiel(Integer id, TypeMateriel typeMateriel, Boolean mobile) {
        this.id = id;
        this.typeMateriel = typeMateriel;
        this.mobile = mobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypeMateriel getTypeMateriel() {
        return typeMateriel;
    }

    public void setTypeMateriel(TypeMateriel typeMateriel) {
        this.typeMateriel = typeMateriel;
    }

    public Boolean getMobile() {
        return mobile;
    }

    public void setMobile(Boolean mobile) {
        this.mobile = mobile;
    }
}
