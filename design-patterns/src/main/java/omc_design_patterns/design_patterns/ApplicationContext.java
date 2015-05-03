package omc_design_patterns.design_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ApplicationContext {

	public static void main(String[] args) {
		 SpringApplication.run(ApplicationContext.class, args);

	}

}
