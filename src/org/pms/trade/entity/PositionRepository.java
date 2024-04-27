package org.pms.trade.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<PositionEntity, String> {
    List<PositionEntity> findAll();
}
