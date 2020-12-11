/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.vipapp.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author Marko
 */
@Entity
public class Mesto implements Serializable {
    @Id
    @Column(name = "idMesto", unique = true, nullable = false)
    private int idMesto;

    @Column(name = "naziv", length = 50)
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
