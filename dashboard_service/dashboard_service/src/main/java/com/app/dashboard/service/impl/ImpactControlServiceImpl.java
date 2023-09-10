package com.app.dashboard.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dashboard.entity.ImpactControlEntity;
import com.app.dashboard.repository.ImpactControlRepository;
import com.app.dashboard.service.ImpactControlService;
import com.app.main.model.ImpactControl;

@Service
public class ImpactControlServiceImpl implements ImpactControlService {

	@Autowired
	private ImpactControlRepository impactControlRepository;

	@Override
	public List<ImpactControl> getAllImpactControl(String lanID, String password) {
		List<ImpactControl> list = new ArrayList<>();
		List<ImpactControlEntity> listRepo = impactControlRepository.getAllImpactControl(lanID);
		for (ImpactControlEntity impactControlEntity : listRepo) {
			ImpactControl control = new ImpactControl();
			control.setBusinessUnit(impactControlEntity.getBusinessUnit());
			control.setDnis(impactControlEntity.getDnis());
			list.add(control);
		}
		return list;
	}

}
