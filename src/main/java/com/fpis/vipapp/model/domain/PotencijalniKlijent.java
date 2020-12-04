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
public class PotencijalniKlijent {
    private int idPotKlijent;
    private String naziv;
    private String telefon;
    private Date datum;
    private String napomena;
    private String email;
    private Zaposleni zaposleni;
    private Zaposleni zaposleni1;

    public PotencijalniKlijent() {
    }

    public PotencijalniKlijent(int idPotKlijent, String naziv, String telefon, Date datum, String napomena, String email, Zaposleni zaposleni, Zaposleni zaposleni1) {
        this.idPotKlijent = idPotKlijent;
        this.naziv = naziv;
        this.telefon = telefon;
        this.datum = datum;
        this.napomena = napomena;
        this.email = email;
        this.zaposleni = zaposleni;
        this.zaposleni1 = zaposleni1;
    }

    public int getIdPotKlijent() {
        return idPotKlijent;
    }

    public void setIdPotKlijent(int idPotKlijent) {
        this.idPotKlijent = idPotKlijent;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Zaposleni getZaposleni1() {
        return zaposleni1;
    }

    public void setZaposleni1(Zaposleni zaposleni1) {
        this.zaposleni1 = zaposleni1;
    }
    
    
}
