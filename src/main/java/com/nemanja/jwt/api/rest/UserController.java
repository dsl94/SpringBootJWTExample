package com.nemanja.jwt.api.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nemanja on 5/13/17.
 */
@RestController
public class UserController {

	/**
	 * Simple resource that return some users
	 * @return list of users
	 */
	@RequestMapping("/users")
	public @ResponseBody
	String getUsers() {
		return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"}," +
				"{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}";
	}
}
