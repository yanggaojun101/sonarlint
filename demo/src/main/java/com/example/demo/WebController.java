package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = { "/web" })
public class WebController {

	@GetMapping
	public Object loginpage() {
		return "login";
	}

	@PostMapping(value = "/login")
	@ResponseBody
	public Object login() {
		return null;
	}
}
