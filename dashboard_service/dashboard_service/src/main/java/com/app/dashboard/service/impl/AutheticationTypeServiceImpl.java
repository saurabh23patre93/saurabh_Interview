package com.app.dashboard.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dashboard.entity.AutheticationTypeEntity;
import com.app.dashboard.repository.AutheticationTypeRepository;
import com.app.dashboard.service.AutheticationTypeService;
import com.app.main.model.AutheticationType;

@Service
public class AutheticationTypeServiceImpl implements AutheticationTypeService {

	@Autowired
	private AutheticationTypeRepository autheticationTypeRepository;

	@Override
	public List<AutheticationType> getAutheticationTypeMetrics(String businessUnit, String fromDate, String toDate) {
		List<AutheticationType> autheticationTypes = new ArrayList<>();
		List<AutheticationTypeEntity> list = autheticationTypeRepository.findAll();
		for (AutheticationTypeEntity autheticationTypeEntity : list) {
			AutheticationType autheticationType = new AutheticationType();
			autheticationType.setAuthenticatedCall(autheticationTypeEntity.getAuthenticatedCall());
			autheticationType.setFullyAuth(autheticationTypeEntity.getFullyAuth());
			autheticationType.setNoAuth(autheticationTypeEntity.getNoAuth());
			autheticationType.setPartialAuth(autheticationTypeEntity.getPartialAuth());
			autheticationTypes.add(autheticationType);
		}
		return autheticationTypes;
	}

}
