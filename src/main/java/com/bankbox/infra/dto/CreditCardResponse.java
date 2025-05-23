package com.bankbox.infra.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.YearMonth;

public class CreditCardResponse {
	public Long id;
	@JsonProperty("owner_name")
	public String ownerName;
	public String number;
	public String expiration;
	@JsonProperty("last_numbers")
	public String lastNumbers;
	@JsonProperty("security_number")
	public int securityNumber;
	public String type;
	public String brand;
	public Long limit;
}
