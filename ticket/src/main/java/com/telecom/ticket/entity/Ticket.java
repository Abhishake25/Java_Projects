package com.telecom.ticket.entity;

import java.time.LocalDateTime;

import com.telecom.ticket.model.Category;
import com.telecom.ticket.model.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name="tickets")
public class Ticket {
      @Id
      @Column(name="id")
      @GeneratedValue(generator="increment")
	private Long id;
      
	@Column(name="requesterPhone")
	private String requesterPhone;
	
	@Enumerated(EnumType.STRING)
	@Column(name="category")
	private Category category;
	
	@Column(name="issueDetails")
	private String issueDetails;
	
	@Column(name="resolutionDetails")
	private String resolutionDetails;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private Status status;
	
	private LocalDateTime createDateTime;
	private LocalDateTime resolutionDateTime;
	
	@PrePersist
	protected void onCreate() {
		this.createDateTime = LocalDateTime.now();
	}

	public Long getId() {
		return id;
	}

	public Ticket() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getResolutionDetails() {
		return resolutionDetails;
	}

	public void setResolutionDetails(String resolutionDetails) {
		this.resolutionDetails = resolutionDetails;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getResolutionDateTime() {
		return resolutionDateTime;
	}

	public void setResolutionDateTime(LocalDateTime resolutionDateTime) {
		this.resolutionDateTime = resolutionDateTime;
	}
}
