/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.vipapp.services;


import com.fpis.vipapp.model.domain.Mesto;
import com.fpis.vipapp.repositories.MestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Marko
 */
@Service
public class MestoService {
    MestoRepository mestoRepository;

    @Autowired
    MestoService(MestoRepository mestoRepository){
        this.mestoRepository = mestoRepository;
    }

    public Mesto addNew(String name) {
        Mesto mesto = new Mesto();
        mesto.setNaziv(name);
        return mestoRepository.save(mesto);
    }

    public Mesto findById(int id) {
        return mestoRepository.findById(id).orElse(null);
    }

    public List<Mesto> findAll(){
        return  mestoRepository.findAll();
    }

    public Mesto findByName(String naziv){
        return mestoRepository.findByNaziv(naziv);
    }

    public Mesto update(int id,String naziv){
        Mesto mesto = mestoRepository.findById(id).orElse(null);
        mesto.setNaziv(naziv);
        return mestoRepository.save(mesto);
    }

    public void deleteById(int id){
        mestoRepository.deleteById(id);
    }

    public void deleteAll(){
        mestoRepository.deleteAll();
    }
}
