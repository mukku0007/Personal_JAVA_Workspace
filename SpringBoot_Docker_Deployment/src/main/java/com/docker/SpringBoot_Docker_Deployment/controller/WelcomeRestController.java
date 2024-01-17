package com.docker.SpringBoot_Docker_Deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/docker")
	public String Welcome() {
		return "Welcome to the Docker Hub....!";
	}
}
