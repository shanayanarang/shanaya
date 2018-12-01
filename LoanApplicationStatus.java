package com.genworth.genie.common;

public enum LoanApplicationStatus {
	UNDERWRITING("In Underwriting"), PENDING_SECOND_REVIEW(
			"Pending Second Review"), DATA_ENTRY("In Data Entry");
	private String description;

	private LoanApplicationStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
