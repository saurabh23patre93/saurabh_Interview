package com.app.dashboard.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dashboard.entity.ContainmentEntity;
import com.app.dashboard.repository.ContainmentRepository;
import com.app.dashboard.service.ContainmentService;
import com.app.main.model.Containment;

@Service
public class ContainmentServiceImpl implements ContainmentService {

	@Autowired
	private ContainmentRepository containmentRepository;

	@Override
	public List<Containment> getContainmentMetrics(String businessUnit, String fromDate, String toDate) {
		List<Containment> listOfResult = new ArrayList<>();
		List<ContainmentEntity> listOfEntity = containmentRepository.getContainmentMetrics(businessUnit, fromDate, toDate);
		for (ContainmentEntity containmentEntity : listOfEntity) {
			Containment containment = new Containment();
			containment.setTotal(containmentEntity.getTotal());
			containment.setContained(containmentEntity.getContained());
			containment.setNotContained(containmentEntity.getNotContained());
			listOfResult.add(containment);
		}
		return listOfResult;
	}

}
