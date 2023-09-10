package com.app.dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BotLevel {
	private Integer refill;
	private Integer orderStatus;
	private Integer balanceAmpersandPayment;
	private Integer retailCall;
}
