package com.app.dashboard.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dashboard.entity.BotLevelEntity;
import com.app.dashboard.repository.BotLevelRepository;
import com.app.dashboard.service.BotLevelService;
import com.app.main.model.BotLevel;

@Service
public class BotLevelServiceImpl implements BotLevelService {

	@Autowired
	private BotLevelRepository botLevelRepository;

	@Override
	public List<BotLevel> getBotLevelMetrics(String businessUnit, String fromDate, String toDate) {
		List<BotLevel> botLevels = new ArrayList<>();
		List<BotLevelEntity> list = botLevelRepository.findAll();
		for (BotLevelEntity botLevelEntity : list) {
			BotLevel botLevel = new BotLevel();
			botLevel.setBalanceAmpersandPayment(botLevelEntity.getBalanceAmpersandPayment());
			botLevel.setOrderStatus(botLevelEntity.getOrderStatus());
			botLevel.setRefill(botLevelEntity.getRefill());
			botLevel.setRetailCall(botLevelEntity.getRetailCall());
			botLevels.add(botLevel);
		}
		return botLevels;
	}

}
