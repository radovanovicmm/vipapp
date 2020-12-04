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
public class Pozicija {
    private int idPozicija;
    private String naziv;
    private Pozicija pozicija;
    private OrganizacionaJedinica orgJed;

    public Pozicija() {
    }

    public Pozicija(int idPozicija, String naziv, Pozicija pozicija, OrganizacionaJedinica orgJed) {
        this.idPozicija = idPozicija;
        this.naziv = naziv;
        this.pozicija = pozicija;
        this.orgJed = orgJed;
    }

    public int getIdPozicija() {
        return idPozicija;
    }

    public void setIdPozicija(int idPozicija) {
        this.idPozicija = idPozicija;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Pozicija getPozicija() {
        return pozicija;
    }

    public void setPozicija(Pozicija pozicija) {
        this.pozicija = pozicija;
    }

    public OrganizacionaJedinica getOrgJed() {
        return orgJed;
    }

    public void setOrgJed(OrganizacionaJedinica orgJed) {
        this.orgJed = orgJed;
    }
    
    
}
