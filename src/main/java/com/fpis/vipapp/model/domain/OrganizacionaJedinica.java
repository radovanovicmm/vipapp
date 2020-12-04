/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isvip.model.domain;

/**
 *
 * @author Marko
 */
public class OrganizacionaJedinica {
    private int idOrgJed;
    private String naziv;

    public OrganizacionaJedinica() {
    }

    public OrganizacionaJedinica(int idOrgJed, String naziv) {
        this.idOrgJed = idOrgJed;
        this.naziv = naziv;
    }

    public int getIdOrgJed() {
        return idOrgJed;
    }

    public void setIdOrgJed(int idOrgJed) {
        this.idOrgJed = idOrgJed;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    
}
