package com.app.dashboard.service;

import java.util.List;

import com.app.main.model.AutheticationType;

public interface AutheticationTypeService {
	List<AutheticationType> getAutheticationTypeMetrics(String businessUnit, String fromDate, String toDate);
}
