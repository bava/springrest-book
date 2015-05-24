package com.apress;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.models.dto.builder.ApiInfoBuilder;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
@EnableSwagger
public class SwaggerConfig {

	@Inject
	private SpringSwaggerConfig springSwaggerConfig;
	
	@Bean
	public SwaggerSpringMvcPlugin configureSwagger() {
		SwaggerSpringMvcPlugin swaggerSpringMvcPlugin = new SwaggerSpringMvcPlugin(this.springSwaggerConfig);
		
		ApiInfo apiInfo = new ApiInfoBuilder()
							        .title("QuickPoll REST API")
							        .description("QuickPoll Api for creating and managing polls")
							        .termsOfServiceUrl("http://example.com/terms-of-service")
							        .contact("info@example.com")
							        .license("MIT License")
							        .licenseUrl("http://opensource.org/licenses/MIT")
							        .build();
		
		swaggerSpringMvcPlugin
					.apiInfo(apiInfo)
					.apiVersion("1.0")
					.includePatterns("/polls/*.*", "/votes/*.*", "/computeresult/*.*");
		
		swaggerSpringMvcPlugin.useDefaultResponseMessages(false);
		
	    return swaggerSpringMvcPlugin;
	}
}
