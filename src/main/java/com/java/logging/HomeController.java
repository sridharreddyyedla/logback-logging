package com.java.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String getHome() {
		logger.trace("Trace message");
		logger.debug("Debug message");
		logger.info("info message");
		logger.warn("warning message");
		logger.error("error message");
		return "Home page";
	}

}
