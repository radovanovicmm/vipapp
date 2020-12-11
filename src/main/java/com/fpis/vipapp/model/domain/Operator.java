/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.vipapp.model.domain;

/**
 *
 * @author Marko
 */
public class Operator {
    private int idOperator;
    private String naziv;

    public Operator() {
    }

    public Operator(int idOperator, String naziv) {
        this.idOperator = idOperator;
        this.naziv = naziv;
    }

    public int getIdOperator() {
        return idOperator;
    }

    public void setIdOperator(int idOperator) {
        this.idOperator = idOperator;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
}
