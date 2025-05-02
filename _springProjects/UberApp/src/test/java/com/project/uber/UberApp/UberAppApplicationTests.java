package com.project.uber.UberApp;

import com.project.uber.UberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {

	@Autowired
	private EmailSenderService emailsenderService;

	@Test
	void contextLoads() {
		emailsenderService.sendEmail("facayoj992@exclussi.com"
				,"Testing mail"
				,"body");
	}

}
