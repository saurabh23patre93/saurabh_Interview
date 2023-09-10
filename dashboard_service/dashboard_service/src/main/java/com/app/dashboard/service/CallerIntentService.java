package com.app.dashboard.service;

import java.util.List;

import com.app.main.model.CallerIntent;

public interface CallerIntentService {
	List<CallerIntent> getCallerIntentMetrics(String businessUnit, String fromDate, String toDate);
}
