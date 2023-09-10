package com.app.dashboard.service;

import java.util.List;

import com.app.main.model.ImpactControl;

public interface ImpactControlService {

	List<ImpactControl> getAllImpactControl(String lanID, String password);
}
