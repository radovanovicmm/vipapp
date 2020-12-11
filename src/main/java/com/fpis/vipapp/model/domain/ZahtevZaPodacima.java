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
public class ZahtevZaPodacima {
    private int idZahtev;
    private int brZaposlenih;
    private int brSimKartice;
    private Date datum;
    private Zaposleni zaposleni;
    private Klijent klijent;
    private Operator operator;

    public ZahtevZaPodacima() {
    }

    public ZahtevZaPodacima(int idZahtev, int brZaposlenih, int brSimKartice, Date datum, Zaposleni zaposleni, Klijent klijent, Operator operator) {
        this.idZahtev = idZahtev;
        this.brZaposlenih = brZaposlenih;
        this.brSimKartice = brSimKartice;
        this.datum = datum;
        this.zaposleni = zaposleni;
        this.klijent = klijent;
        this.operator = operator;
    }

    public int getIdZahtev() {
        return idZahtev;
    }

    public void setIdZahtev(int idZahtev) {
        this.idZahtev = idZahtev;
    }

    public int getBrZaposlenih() {
        return brZaposlenih;
    }

    public void setBrZaposlenih(int brZaposlenih) {
        this.brZaposlenih = brZaposlenih;
    }

    public int getBrSimKartice() {
        return brSimKartice;
    }

    public void setBrSimKartice(int brSimKartice) {
        this.brSimKartice = brSimKartice;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    
}
