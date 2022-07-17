package com.bootcamp.conectDDBB.controller;

import com.bootcamp.conectDDBB.model.Coche;
import com.bootcamp.conectDDBB.service.CocheService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CocheController {

    private final CocheService cocheService;

    @GetMapping
    public Coche addCoche(@RequestBody Coche coche){

        return cocheService.addCoche(coche);
    }
}
