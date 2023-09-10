package com.app.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.dashboard.entity.BotLevelEntity;

@Repository
public interface BotLevelRepository extends JpaRepository<BotLevelEntity, Integer> {

	@Query(value = " SELECT * FROM AUTHETICATION_TYPE  where business_unit= :businessUnit and from_date = :fromDate and to_date = :toDate ", nativeQuery = true)
	List<BotLevelEntity> getBotLevelMetrics(@Param(value = "businessUnit") String businessUnit,
			@Param(value = "fromDate") String fromDate, @Param(value = "toDate") String toDate);
}
