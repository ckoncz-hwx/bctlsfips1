package com.ck.bctlsfips1;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	SampleClient sampleClient;

	private static Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(App.class, args);
		LOG.info("APPLICATION FINISHED");
	}

	@Override
	public void run(String... args) {
		LOG.info("EXECUTING : command line runner with args = " + Arrays.asList(args));
		if (args.length == 0) {
			LOG.error("Please specify the URL as a cli argument");
			return;
		}
		String url = args[0];
		LOG.info("Retrieving data from url " + url);

		String data = sampleClient.getData(url);
		System.out.println(data);
	}
}
