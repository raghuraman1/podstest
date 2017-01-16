package podtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class PodTestApplication {
	
	@Bean
	   public ServletRegistrationBean reg() {
	      ServletRegistrationBean registration = new ServletRegistrationBean(new MyServlet(), "/");

	      return registration;
	   }
		
	public static void main(String[] args) {
		SpringApplication.run(PodTestApplication.class, args);

	}

}
