package ru.yandex.incoming34.quarter4Homework5.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@SpringBootConfiguration
@ComponentScan("ru.yandex.incoming34.quarter4Homework5.**")
public class OpenApiConfig {

	@Bean
	OpenAPI customOpenApi() {
		OpenAPI openAPI = new OpenAPI();
		openAPI.setInfo(info());
		return openAPI;
	}

	@Bean
	Info info() {
		return new Info().title("Student repository test application").description("Educational project").version("1.0")
				.contact(contact());
	}

	@Bean
	Contact contact() {
		return new Contact().email("incoming34@yandex.ru").name("Sergei Aidinov");
	}

}
