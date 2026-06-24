package com.telecom.ticket.dto;

import com.telecom.ticket.model.Category;

public class TicketCreateDTO {

	private String requesterPhone;
	
	private Category category;
	
	private String issueDetails;

	

	public String getRequesterPhone() {
		return requesterPhone;
	}

	public void setRequesterPhone(String requesterPhone) {
		this.requesterPhone = requesterPhone;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getIssueDetails() {
		return issueDetails;
	}

	public void setIssueDetails(String issueDetails) {
		this.issueDetails = issueDetails;
	}
	
	
}
