package com.prototype.pages.controller;

import com.prototype.pages.domain.Titans;
import com.prototype.pages.mapper.TitanVO;
import com.prototype.pages.service.impl.TitansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/titans")
public class TitansController {

    @Autowired
    TitansService titansService;

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<Page<Titans>> getTitans(int pageNo){
        return new ResponseEntity<> (titansService.getTitansInfo(pageNo), HttpStatus.OK);
    }

    @GetMapping(path = "/page", produces = "application/json")
    public ResponseEntity<Page<TitanVO>> getTitansPage(int pageNo){
        return new ResponseEntity<> (titansService.findTitansPage(pageNo), HttpStatus.OK);
    }

}
