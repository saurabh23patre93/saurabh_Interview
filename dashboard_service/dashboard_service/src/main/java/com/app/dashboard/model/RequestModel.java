package com.app.dashboard.model;

import org.springframework.data.repository.query.Param;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestModel {
	private String businessUnit;
	private String fromDate;
	private String toDate;
}
