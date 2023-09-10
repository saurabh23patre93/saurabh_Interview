package com.app.dashboard.entity;

import java.io.Serializable;

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
@Table(name = "CONTAINMENT")
public class ContainmentEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private Integer total;
	private Integer contained;
	@Column(name = "NOT_CONTAINED")
	private Integer notContained;
	@Column(name = "BUSINESS_UNIT")
	private String businessUnit;
	@Column(name = "FROM_DATE")
	private String fromDate;
	@Column(name = "TO_DATE")
	private String toDate;
}
