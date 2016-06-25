package com.dom.logowanie.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dom.logowanie.model.User;
import com.dom.logowanie.services.UserService;
import com.dom.logowanie.template.UserJDBCTemplate;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("/user_service")
public class UserController {
		
	public ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	public UserService userService = (UserService)context.getBean("userService");

    @RequestMapping(value = "/user",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.getAllUser();
        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    
	@RequestMapping(value = "/user/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserWithId(@PathVariable("id") Integer id) {
		User user = userService.getUser(id);
        if (user == null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    
	
}

