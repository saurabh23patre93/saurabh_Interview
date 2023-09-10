package com.app.dashboard.service;

import java.util.List;

import com.app.main.model.BotLevel;

public interface BotLevelService {
	List<BotLevel> getBotLevelMetrics(String businessUnit, String fromDate, String toDate);
}
