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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "IMPACT_CONTROL")
public class ImpactControlEntity {
	@Id
	private int id;
	@Column(name = "BUSINESS_UNIT")
	private String businessUnit;
	private Integer dnis;
	@Column(name = "USER_ID")
	private String userId;
}
