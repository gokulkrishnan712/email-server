package com.hut.emailserver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hut.emailserver.model.EmailData;
import com.hut.emailserver.service.EmailService;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RestController
@RequestMapping("/v1.0")
@RequiredArgsConstructor
public class EmailController {

	
	private final EmailService emailService;

	@SneakyThrows
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestBody EmailData data) {
		emailService.sendEmail(data);
		return "Success";

	}

}
