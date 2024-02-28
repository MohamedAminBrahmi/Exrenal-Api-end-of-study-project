package ws.api.gds.tbo.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="WS-API-GDS-TBO-MS",
				version="1.0.0",
				description="PFE Project",
				contact = @Contact(
						name="Mohamed Amin Brahmi",
						email="brahmimedamin7@gmail.com"
				),
				license=@License(
						name="License")
				
				
				
				)
		
		)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
