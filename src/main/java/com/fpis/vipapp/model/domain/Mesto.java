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
public class Mesto {
    private int idMesto;
    private String naziv;

    public Mesto() {
    }

    public Mesto(int postanskiBroj, String naziv) {
        this.idMesto = postanskiBroj;
        this.naziv = naziv;
    }

    public int getPostanskiBroj() {
        return idMesto;
    }

    public void setPostanskiBroj(int postanskiBroj) {
        this.idMesto = postanskiBroj;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mesto other = (Mesto) obj;
        if (this.idMesto != other.idMesto) {
            return false;
        }
        return true;
    }
    
    
}
