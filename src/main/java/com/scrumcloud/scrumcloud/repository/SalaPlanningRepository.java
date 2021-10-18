package com.scrumcloud.scrumcloud.repository;

import com.scrumcloud.scrumcloud.model.SalaPlanning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaPlanningRepository extends JpaRepository<SalaPlanning, Long> {
}
