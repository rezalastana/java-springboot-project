package com.miniproject.krs.repository;

import com.miniproject.krs.entity.FakultasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FakultasRepo extends JpaRepository<FakultasEntity,String> {
}