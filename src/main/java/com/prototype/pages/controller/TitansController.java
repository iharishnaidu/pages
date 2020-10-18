package com.prototype.pages.controller;

import com.prototype.pages.domain.Titans;
import com.prototype.pages.service.impl.TitansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/titans")
public class TitansController {

    @Autowired
    TitansService titansService;

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Titans>> getTitans(){
        return new ResponseEntity<> (titansService.getTitansInfo(), HttpStatus.OK);
    }

}
