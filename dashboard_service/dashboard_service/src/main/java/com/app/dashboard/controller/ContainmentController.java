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

import com.app.dashboard.service.ContainmentService;
import com.app.main.ContainmentApi;
import com.app.main.model.Containment;

@RestController
@RequestMapping("/dashboard/v1/api")
public class ContainmentController implements ContainmentApi {

	@Autowired
	private ContainmentService containmentService;

	@Override
	@PostMapping(path = "/containment", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Containment>> getContainmentMetrics(@RequestParam(value = "businessUnit") String businessUnit,
			@RequestParam(value = "fromDate") String fromDate, @RequestParam(value = "toDate") String toDate) {
		return new ResponseEntity<>(containmentService.getContainmentMetrics(businessUnit, fromDate, toDate),
				HttpStatus.OK);
	}
}
