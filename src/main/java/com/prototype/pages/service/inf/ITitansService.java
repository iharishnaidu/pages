package com.prototype.pages.service.inf;

import com.prototype.pages.domain.Titans;
import com.prototype.pages.mapper.TitanVO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ITitansService {

    Page<Titans> getTitansInfo(int pageNo);

    Page<TitanVO> findTitansPage(int pageNo);

}
