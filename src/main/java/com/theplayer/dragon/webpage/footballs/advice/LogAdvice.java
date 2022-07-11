package com.theplayer.dragon.webpage.footballs.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LogAdvice {
	private Logger logger = LoggerFactory.getLogger(LogAdvice.class);
	
	public void printLog() {
		logger.info("LOG {}", this);
	}

}
