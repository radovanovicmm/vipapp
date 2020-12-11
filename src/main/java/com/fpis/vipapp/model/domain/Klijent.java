/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.vipapp.model.domain;

import java.util.Date;

/**
 *
 * @author Marko
 */
public class Klijent {
    private int idKlijent;
    private int PIB;
    private String naziv;
    private String telefon;
    private String webStrana;
    private Date datumOsnivanja;
    private Broj broj;
    private Delatnost delatnost;
    private PotencijalniKlijent potKlijent;

    public Klijent() {
    }

    public Klijent(int idKlijent, int PIB, String naziv, String telefon, String webStrana, Date datumOsnivanja, Broj broj, Delatnost delatnost, PotencijalniKlijent potKlijent) {
        this.idKlijent = idKlijent;
        this.PIB = PIB;
        this.naziv = naziv;
        this.telefon = telefon;
        this.webStrana = webStrana;
        this.datumOsnivanja = datumOsnivanja;
        this.broj = broj;
        this.delatnost = delatnost;
        this.potKlijent = potKlijent;
    }

    public int getIdKlijent() {
        return idKlijent;
    }

    public void setIdKlijent(int idKlijent) {
        this.idKlijent = idKlijent;
    }

    public int getPIB() {
        return PIB;
    }

    public void setPIB(int PIB) {
        this.PIB = PIB;
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

    public String getWebStrana() {
        return webStrana;
    }

    public void setWebStrana(String webStrana) {
        this.webStrana = webStrana;
    }

    public Date getDatumOsnivanja() {
        return datumOsnivanja;
    }

    public void setDatumOsnivanja(Date datumOsnivanja) {
        this.datumOsnivanja = datumOsnivanja;
    }

    public Broj getBroj() {
        return broj;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
    }

    public Delatnost getDelatnost() {
        return delatnost;
    }

    public void setDelatnost(Delatnost delatnost) {
        this.delatnost = delatnost;
    }

    public PotencijalniKlijent getPotKlijent() {
        return potKlijent;
    }

    public void setPotKlijent(PotencijalniKlijent potKlijent) {
        this.potKlijent = potKlijent;
    }
    
    
}
