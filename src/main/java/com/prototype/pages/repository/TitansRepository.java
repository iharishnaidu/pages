package com.prototype.pages.repository;

import com.prototype.pages.domain.Titans;
import com.prototype.pages.mapper.TitanVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface TitansRepository extends JpaRepository<Titans, Long> {

    @Query(nativeQuery = true)
    Page<TitanVO> findTitansPage(Pageable pageable);

}
