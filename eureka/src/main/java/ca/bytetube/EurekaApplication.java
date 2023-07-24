package ca.bytetube;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	private static final Logger log = LoggerFactory.getLogger(EurekaApplication.class);
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EurekaApplication.class);
		Environment env = app.run(args).getEnvironment();
		log.info("Start successfully!!");
		log.info("Eureka addr: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
	}

}
