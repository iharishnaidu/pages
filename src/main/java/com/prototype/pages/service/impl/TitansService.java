package com.prototype.pages.service.impl;

import com.prototype.pages.domain.Titans;
import com.prototype.pages.repository.TitansRepository;
import com.prototype.pages.service.inf.ITitansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitansService implements ITitansService {

    @Autowired
    TitansRepository titansRepository;

    public List<Titans> getTitansInfo() {
        return titansRepository.findAll();
    }

}
