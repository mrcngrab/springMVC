package com.dom.logowanie.controller;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dom.logowanie.config.RestConfig;
import com.dom.logowanie.model.User;
import com.dom.logowanie.response.UserResponse;
import com.dom.logowanie.services.UserService;


/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("/user")
public class UserController {
		
	public ApplicationContext context = new AnnotationConfigApplicationContext(RestConfig.class);
	public UserService userService = context.getBean(UserService.class);

  @RequestMapping(value = "/",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<UserResponse> listAllUsers() {
	  UserResponse response = userService.getAllUser();
      return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
  }
  
	@RequestMapping(value = "/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<UserResponse> getUserWithId(@PathVariable("id") Integer id) {
		UserResponse response = userService.getUser(id);
		return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
  }
   
	
}

