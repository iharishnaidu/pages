package com.prototype.pages.service.inf;

import com.prototype.pages.domain.Titans;
import org.springframework.data.domain.Page;

public interface ITitansService {

    Page<Titans> getTitansInfo(int pageNo);

}
