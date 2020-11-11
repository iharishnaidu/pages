package com.prototype.pages.service.impl;

import com.prototype.pages.domain.Titans;
import com.prototype.pages.mapper.TitanVO;
import com.prototype.pages.repository.TitansRepository;
import com.prototype.pages.service.inf.ITitansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TitansService implements ITitansService {

    @Autowired
    TitansRepository titansRepository;

    public Page<Titans> getTitansInfo(int pageNo) {

        Pageable paging = PageRequest.of(pageNo, 20);
        return titansRepository.findAll(paging);
    }

    public Page<TitanVO> findTitansPage(int pageNo) {

        Pageable paging = PageRequest.of(pageNo, 20);
        Page<TitanVO> titanPage = titansRepository.findTitansPage(paging);
        List<TitanVO> some = new ArrayList<>();

        TitanVO[] titanVOS;
        titanVOS = titanPage.toList().toArray(new TitanVO[0]);

        for(TitanVO titanp: titanVOS) {
            TitanVO titan = new TitanVO();
            titan.setTitanId(titanp.getTitanId());
            titan.setTitanName(titanp.getTitanName());
            titan.setBoyId(titanp.getBoyId());
            titan.setBoyName(titanp.getBoyName());
            some.add(titan);
        }

        Page<TitanVO> newpage = new PageImpl<>(some, paging, titanPage.getTotalElements());
        return newpage;
    }
}
