package com.app.dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AutheticationType {
	private Integer fullyAuth;
	private Integer partialAuth;
	private Integer noAuth;
	private Integer authenticatedCall;
}
