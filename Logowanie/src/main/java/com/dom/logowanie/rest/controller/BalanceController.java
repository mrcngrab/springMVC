package com.dom.logowanie.rest.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dom.logowanie.rest.config.RestConfig;
import com.dom.logowanie.rest.response.BalanceResponse;
import com.dom.logowanie.rest.services.BalanceService;


@RestController
@RequestMapping("/balance")
public class BalanceController {

	public ApplicationContext context = new AnnotationConfigApplicationContext(RestConfig.class);
	public BalanceService balanceService = context.getBean(BalanceService.class);
	  
	@RequestMapping(value = "/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BalanceResponse> getUserWithId(@PathVariable("id") Integer id) {
		BalanceResponse response = balanceService.getBalance(id);
		return new ResponseEntity<BalanceResponse>(response, HttpStatus.OK);
	}
}
