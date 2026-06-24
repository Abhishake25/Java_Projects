package com.telecom.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.ticket.dto.TicketCreateDTO;
import com.telecom.ticket.dto.TicketUpdateDTO;
import com.telecom.ticket.entity.Ticket;
import com.telecom.ticket.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	TicketRepository ticketRepository;
	@Override
	public Ticket createTicket(TicketCreateDTO dto) {
		Ticket ticket = new Ticket();
		ticket.setRequesterPhone(dto.getRequesterPhone());
		ticket.setCategory(dto.getCategory());
		ticket.setIssueDetails(dto.getIssueDetails());
		return ticketRepository.save(ticket);
	}

	@Override
	public Ticket updateTicket(Long id, TicketUpdateDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getAllOpenTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket getTicketById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
