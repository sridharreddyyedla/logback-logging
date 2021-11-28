package com.java.logging;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

@RestController
public class LogbackController {
	
	Logger logger = (Logger) LoggerFactory.getLogger("com.java.logging.LogbackController");

	@RequestMapping("/page2")
	public String getHome() {
//		logger.setLevel(Level.INFO);
		
		logger.trace("Trace message");
		logger.debug("Debug message");
		logger.info("info message");
		logger.warn("warning message");
		logger.error("error message");
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
		return "Page 2";
	}

}
