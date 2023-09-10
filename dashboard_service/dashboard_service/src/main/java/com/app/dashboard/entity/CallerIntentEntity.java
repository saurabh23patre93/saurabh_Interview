package com.app.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CALLER_INTENT")
public class CallerIntentEntity {
	@Id
	private Integer id;
	@Column(name = "CALL_TRANSFER")
	private Integer callTransfer;
	@Column(name = "GHOST_CALL")
	private Integer ghostCALL;
	@Column(name = "CFT_CALL")
	private Integer cfTCall;
	@Column(name = "AUTHENTICATED_CALL")
	private Integer authenticatedCall;
	@Column(name = "BUSINESS_UNIT")
	private String businessUnit;
	@Column(name = "FROM_DATE")
	private String fromDate;
	@Column(name = "TO_DATE")
	private String toDate;
}
