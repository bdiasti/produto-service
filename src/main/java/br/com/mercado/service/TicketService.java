/**
 * 
 */
package br.com.mercado.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.mercado.domain.Ticket;

//@FeignClient(name="ticket-service")
public interface TicketService {
	
	@GetMapping(value = "/ticket/produto/{produtoId}")
	Ticket findByProdutoid (@PathVariable("produtoId") Integer produtoId);
		

}