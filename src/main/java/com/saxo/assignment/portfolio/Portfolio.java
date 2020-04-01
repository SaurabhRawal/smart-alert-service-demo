package com.saxo.assignment.portfolio;

import java.math.BigDecimal;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Portfolio {
	
	private int clientId;
	private String clientFirstName;
	private String clientLastName;
	private String clientFund;
	private String email;
	private String phoneNo;
	private BigDecimal clientInvestedAmount;
	private BigDecimal clientCurrentAmount;

}
