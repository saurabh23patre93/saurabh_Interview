package com.app.dashboard.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dashboard.entity.CallerIntentEntity;
import com.app.dashboard.repository.CallerIntentRepository;
import com.app.dashboard.service.CallerIntentService;
import com.app.main.model.CallerIntent;

@Service
public class CallerIntentServiceImpl implements CallerIntentService {

	@Autowired
	private CallerIntentRepository intentRepository;

	@Override
	public List<CallerIntent> getCallerIntentMetrics(String businessUnit, String fromDate, String toDate) {
		List<CallerIntent> callerIntents = new ArrayList<>();
		List<CallerIntentEntity> list = intentRepository.findAll();
		for (CallerIntentEntity callerIntentEntity : list) {
			CallerIntent callerIntent = new CallerIntent();
			callerIntent.setAuthenticatedCall(callerIntentEntity.getAuthenticatedCall());
			callerIntent.setCallTransfer(callerIntentEntity.getCallTransfer());
			callerIntent.setCfTCall(callerIntentEntity.getCfTCall());
			callerIntent.setGhostCALL(callerIntentEntity.getGhostCALL());
			callerIntents.add(callerIntent);
		}
		return callerIntents;
	}

}
