package com.prototype.pages.service.impl;

import com.prototype.pages.domain.Titans;
import com.prototype.pages.repository.TitansRepository;
import com.prototype.pages.service.inf.ITitansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TitansService implements ITitansService {

    @Autowired
    TitansRepository titansRepository;

    public Page<Titans> getTitansInfo(int pageNo) {

        Pageable paging = PageRequest.of(pageNo, 20);
        return titansRepository.findAll(paging);
    }

}
