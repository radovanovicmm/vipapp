/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.vipapp.model.domain;

import java.util.Objects;

/**
 *
 * @author Marko
 */
public class Ulica {
    private int idUlice;
    private String naziv;
    private Mesto mesto;

    public Ulica() {
    }

    public Ulica(int idUlice, String naziv, Mesto mesto) {
        this.idUlice = idUlice;
        this.naziv = naziv;
        this.mesto = mesto;
    }

    public int getIdUlice() {
        return idUlice;
    }

    public void setIdUlice(int idUlice) {
        this.idUlice = idUlice;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ulica other = (Ulica) obj;
        if (!Objects.equals(this.idUlice, other.idUlice)) {
            return false;
        }
        if (!Objects.equals(this.mesto, other.mesto)) {
            return false;
        }
        return true;
    }
    
    
    
}
