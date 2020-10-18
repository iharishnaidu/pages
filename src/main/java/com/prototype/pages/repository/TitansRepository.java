package com.prototype.pages.repository;

import com.prototype.pages.domain.Titans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitansRepository extends JpaRepository<Titans, Long> {
}
