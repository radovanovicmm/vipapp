/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.vipapp.model.domain;

import sun.util.calendar.JulianCalendar;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Marko
 */
public class Broj implements Serializable {
    private int brojAdrese;
    private Ulica ulica;

    public Broj() {
    }

    public Broj(int brojAdrese, Ulica ulica) {
        this.brojAdrese = brojAdrese;
        this.ulica = ulica;
    }

    public int getBrojAdrese() {
        return brojAdrese;
    }

    public void setBrojAdrese(int brojAdrese) {
        this.brojAdrese = brojAdrese;
    }

    public Ulica getUlica() {
        return ulica;
    }

    public void setUlica(Ulica ulica) {
        this.ulica = ulica;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Broj other = (Broj) obj;
        if (this.brojAdrese != other.brojAdrese) {
            return false;
        }
        if (!Objects.equals(this.ulica, other.ulica)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brojAdrese, ulica);
    }
}
