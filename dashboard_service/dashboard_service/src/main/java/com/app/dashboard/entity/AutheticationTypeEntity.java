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
@Table(name = "AUTHETICATION_TYPE")
public class AutheticationTypeEntity {
	@Id
	private Integer id;
	@Column(name = "FULLY_AUTH")
	private Integer fullyAuth;
	@Column(name = "PARTIAL_AUTH")
	private Integer partialAuth;
	@Column(name = "NO_AUTH")
	private Integer noAuth;
	@Column(name = "AUTHENTICATED_CALL")
	private Integer authenticatedCall;
	@Column(name = "BUSINESS_UNIT")
	private String businessUnit;
	@Column(name = "FROM_DATE")
	private String fromDate;
	@Column(name = "TO_DATE")
	private String toDate;
}
