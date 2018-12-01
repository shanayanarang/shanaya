package com.genworth.genie.common;

public enum DashBoardSection {
	PRIORITY("My Priority"), REVIEWS("My Reviews"), LOANSTATISTICS("Loan Statistics");
	private String name;

	private DashBoardSection(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
