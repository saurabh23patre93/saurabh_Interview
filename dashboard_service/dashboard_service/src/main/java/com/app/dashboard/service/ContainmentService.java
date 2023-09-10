package com.app.dashboard.service;

import java.util.List;

import com.app.main.model.Containment;

public interface ContainmentService {
	List<Containment> getContainmentMetrics(String businessUnit, String fromDate, String toDate);
}
