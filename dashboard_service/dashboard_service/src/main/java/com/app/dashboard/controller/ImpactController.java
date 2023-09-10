package com.app.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dashboard.service.ImpactControlService;
import com.app.main.ImpactControlApi;
import com.app.main.model.ImpactControl;

@RestController
@RequestMapping("/dashboard/v1/api")
public class ImpactController implements ImpactControlApi {

	@Autowired
	private ImpactControlService service;

	@Override
	@PostMapping(path = "/impactControl", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ImpactControl>> getAllImpactControl(@RequestParam(value = "lanID") String lanID, @RequestParam(value = "password") String password) {
		return new ResponseEntity<>(service.getAllImpactControl(lanID, password), HttpStatus.OK);
	}
}
