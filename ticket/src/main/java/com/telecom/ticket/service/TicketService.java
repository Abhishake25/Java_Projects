package com.telecom.ticket.service;

import java.util.List;

import com.telecom.ticket.dto.TicketCreateDTO;
import com.telecom.ticket.dto.TicketUpdateDTO;
import com.telecom.ticket.entity.Ticket;

public interface TicketService {

	Ticket createTicket(TicketCreateDTO dto);
    Ticket updateTicket(Long id, TicketUpdateDTO dto);
    List<Ticket> getAllOpenTickets();
    Ticket getTicketById(Long id);
}
