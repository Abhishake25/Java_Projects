package com.telecom.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.ticket.dto.TicketCreateDTO;
import com.telecom.ticket.entity.Ticket;
import com.telecom.ticket.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
@PostMapping
public ResponseEntity<Ticket> createTicket(@RequestBody TicketCreateDTO dto){
	
	Ticket savedTicket = ticketService.createTicket(dto);
	
	return new ResponseEntity<Ticket>(savedTicket,HttpStatus.CREATED);
}
	
}
