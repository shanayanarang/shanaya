package com.genworth.genie.common;

public enum LoanApplicationDisposition {
	CONDITIONS_APPROVAL("On Conditions Approval");
	private String description;

	private LoanApplicationDisposition(String description) {
		this.description = description;
	}

}
