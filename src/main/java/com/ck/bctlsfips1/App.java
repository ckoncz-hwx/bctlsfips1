package com.ck.bctlsfips1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
  implements CommandLineRunner {

	@Autowired
	SampleClient sampleClient;
	
    private static Logger LOG = LoggerFactory
      .getLogger(App.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(App.class, args);
        LOG.info("APPLICATION FINISHED");
    }
 
    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : command line runner");
 
        String data = sampleClient.getData();
        System.out.println(data);
    }
}
