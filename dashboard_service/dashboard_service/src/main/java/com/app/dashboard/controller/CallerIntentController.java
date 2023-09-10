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

import com.app.dashboard.service.CallerIntentService;
import com.app.main.CallerIntentApi;
import com.app.main.model.CallerIntent;

@RestController
@RequestMapping("/dashboard/v1/api")
public class CallerIntentController implements CallerIntentApi {

	@Autowired
	private CallerIntentService callerIntentService;

	@Override
	@PostMapping(path = "/callerIntent", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CallerIntent>> getCallerIntentMetrics(@RequestParam(value = "businessUnit") String businessUnit,
			@RequestParam(value = "fromDate") String fromDate, @RequestParam(value = "toDate") String toDate) {
		return new ResponseEntity<>(callerIntentService.getCallerIntentMetrics(businessUnit, fromDate, toDate),
				HttpStatus.OK);
	}
}
