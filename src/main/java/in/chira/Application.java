package in.chira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chira.entity.Insurence;
import in.chira.repositry.InsurenceRepo;
import in.chira.service.Inservice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Inservice inservice = context.getBean(Inservice.class);
		inservice.saveplan();
		
	}

}
