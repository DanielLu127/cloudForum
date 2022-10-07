package com.cloud.cloudForum;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.cloud.cloudForum.dao")
@ComponentScan("com.cloud")
public class CloudForumApplication {

	private static final Logger LOG = LoggerFactory.getLogger(CloudForumApplication.class);

	public static void main(String[] args) {
		Environment env  = SpringApplication.run(CloudForumApplication.class, args).getEnvironment();
		LOG.info("Successfully start");
		LOG.info("start at port:{}", env.getProperty("server.port"));
	}
}
