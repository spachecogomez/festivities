/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.challange.controllers;

import com.challange.model.Festivity;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * This class will manage the JSon requests for the festivities queries.
 * 
 * @author sebpache
 * @version 1.0
 * @since Oct 28, 2015
 */

@Controller
@RestController("/festivitiesJson")
public class FestivitiesJsonController {
    
    @RequestMapping("/operacion/{nombre}")
    public List<Festivity> consultarFestivos(@PathVariable String nombre){
        List<Festivity> list = new ArrayList<Festivity>();
        Festivity f = new Festivity();
        f.setStartDate(new Date());
        f.setEndDate(new Date());
        f.setName(nombre);
        f.setPlace("Colombia");
        list.add(f);
        Festivity f1 = new Festivity();
        f1.setStartDate(new Date());
        f1.setEndDate(new Date());
        f1.setName(nombre);
        f1.setPlace("Colombia");
        list.add(f1);
        return list;
    }
    
}
