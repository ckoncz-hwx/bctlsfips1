package com.ck.bctlsfips1;

import java.util.logging.Logger;

public class JulTest {
	public static void main(String[] args) {
		System.setProperty("java.util.logging.config.file", "jul-logging.properties");
		Logger logger = java.util.logging.Logger.getLogger("csaba");
		logger.warning("my message 1");
		logger.finest("my message 1");
		logger.finest("my message 2");
	}

}
