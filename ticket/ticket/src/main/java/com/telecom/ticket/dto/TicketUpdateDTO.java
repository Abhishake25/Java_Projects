package com.telecom.ticket.dto;

import com.telecom.ticket.model.Status;

public class TicketUpdateDTO {

	private Status status;
	
	private String resolutionDetails;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getResolutionDetails() {
		return resolutionDetails;
	}

	public void setResolutionDetails(String resolutionDetails) {
		this.resolutionDetails = resolutionDetails;
	}
	
	
}
