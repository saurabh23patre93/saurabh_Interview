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
@Table(name = "BOT_LEVEL")
public class BotLevelEntity {
	@Id
	private Integer id;
	@Column(name = "REFILL")
	private Integer refill;
	@Column(name = "ORDER_STATUS")
	private Integer orderStatus;
	@Column(name = "BALANCE_PAYMENT")
	private Integer balanceAmpersandPayment;
	@Column(name = "RETAIL_CALL")
	private Integer retailCall;
	@Column(name = "BUSINESS_UNIT")
	private String businessUnit;
	@Column(name = "FROM_DATE")
	private String fromDate;
	@Column(name = "TO_DATE")
	private String toDate;
}
