/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isvip.model.domain;

import java.util.Date;

/**
 *
 * @author Marko
 */
public class Zaposleni {
    private Long idZap;
    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private Pozicija pozicija;

    public Zaposleni() {
    }

    public Zaposleni(Long idZap, String ime, String prezime, Date datumRodjenja, Pozicija pozicija) {
        this.idZap = idZap;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.pozicija = pozicija;
    }

    public Long getIdZap() {
        return idZap;
    }

    public void setIdZap(Long idZap) {
        this.idZap = idZap;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Pozicija getPozicija() {
        return pozicija;
    }

    public void setPozicija(Pozicija pozicija) {
        this.pozicija = pozicija;
    }
    
    
}
