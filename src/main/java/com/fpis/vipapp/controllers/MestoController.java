/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpis.vipapp.controllers;

import com.fpis.vipapp.model.domain.Mesto;
import com.fpis.vipapp.services.MestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utility.Utility;

import java.util.List;

/**
 *
 * @author Marko
 */
@RestController
@RequestMapping("/mesto")
public class MestoController {
    MestoService mestoService;

    @Autowired
    public MestoController(MestoService mestoService){
        this.mestoService = mestoService;
    }

    @RequestMapping(value = "/add-new", method = RequestMethod.POST)
    public Mesto addNew(@RequestParam(value = "naziv") String naziv){
        if(!naziv.isEmpty())
            return mestoService.addNew(naziv);
        return null;
    }

    @RequestMapping(value = "/find-by-id", method = RequestMethod.POST)
    public Mesto findById(@RequestParam(value = "id") String id){
        if(Utility.isInteger(id))
            return mestoService.findById(Integer.parseInt(id));
        return null;
    }

    @RequestMapping(value = "find-all", method = RequestMethod.POST)
    public List<Mesto> findAll(){
        return mestoService.findAll();
    }

    @RequestMapping(value = "/update")
    public Mesto updateCity(@RequestParam(value = "id") String id,
                            @RequestParam(value = "naziv") String naziv){
        if(!naziv.isEmpty() && Utility.isInteger(id))
            return mestoService.update(Integer.parseInt(id), naziv);
        return null;
    }

    @RequestMapping(value = "/find-by-name")
    public Mesto findByName(@RequestParam(value = "naziv") String naziv){
        if(naziv.isEmpty())
            return  null;
        return mestoService.findByName(naziv);
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable(value = "id") String id){
        mestoService.deleteById(Integer.parseInt(id));
    }
}
