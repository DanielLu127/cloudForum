package com.cloud.cloudForum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CloudForumApplication {

	private static final Logger LOG = LoggerFactory.getLogger(CloudForumApplication.class);

	public static void main(String[] args) {
		Environment env  = SpringApplication.run(CloudForumApplication.class, args).getEnvironment();
		LOG.info("Successfully start");
		LOG.info("start at port:{}", env.getProperty("server.port"));
	}

}
