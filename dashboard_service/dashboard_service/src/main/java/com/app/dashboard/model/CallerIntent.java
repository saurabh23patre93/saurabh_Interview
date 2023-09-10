package com.app.dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CallerIntent {
	private Integer callTransfer;
	private Integer ghostCALL;
	private Integer cfTCall;
	private Integer authenticatedCall;
}
