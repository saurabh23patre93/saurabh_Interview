package com.app.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.dashboard.entity.ImpactControlEntity;

@Repository
public interface ImpactControlRepository extends JpaRepository<ImpactControlEntity, Integer> {

	@Query(value = " SELECT * FROM impact_control WHERE USER_ID = :lanID ", nativeQuery = true)
	List<ImpactControlEntity> getAllImpactControl(@Param(value = "lanID") String lanID);
}
