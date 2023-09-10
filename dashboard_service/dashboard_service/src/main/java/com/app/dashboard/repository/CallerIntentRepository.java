package com.app.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.dashboard.entity.CallerIntentEntity;
import com.app.main.model.CallerIntent;

@Repository
public interface CallerIntentRepository extends JpaRepository<CallerIntentEntity, Integer> {

	@Query(value = " SELECT * FROM CALLER_INTENT  where business_unit= :businessUnit and from_date = :fromDate and to_date = :toDate ", nativeQuery = true)
	List<CallerIntentEntity> getCallerIntentMetrics(@Param(value = "businessUnit") String businessUnit,
			@Param(value = "fromDate") String fromDate, @Param(value = "toDate") String toDate);
}
