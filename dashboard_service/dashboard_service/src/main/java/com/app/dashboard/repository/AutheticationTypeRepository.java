package com.app.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.dashboard.entity.AutheticationTypeEntity;
import com.app.main.model.AutheticationType;

@Repository
public interface AutheticationTypeRepository extends JpaRepository<AutheticationTypeEntity, Integer> {

	@Query(value = " SELECT * FROM bot_level  where business_unit= :businessUnit and from_date = :fromDate and to_date = :toDate ", nativeQuery = true)
	List<AutheticationTypeEntity> getAutheticationTypeMetrics(@Param(value = "businessUnit") String businessUnit,
			@Param(value = "fromDate") String fromDate, @Param(value = "toDate") String toDate);
}
