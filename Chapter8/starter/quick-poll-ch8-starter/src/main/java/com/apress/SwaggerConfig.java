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
	
	private ApiInfo getApiInfo() {
		
		ApiInfo apiInfo = new ApiInfoBuilder()
        .title("QuickPoll REST API")
        .description("QuickPoll Api for creating and managing polls")
        .termsOfServiceUrl("http://example.com/terms-of-service")
        .contact("info@example.com")
        .license("MIT License")
        .licenseUrl("http://opensource.org/licenses/MIT")
        .build();
			
		return apiInfo;
	}
	
	@Bean
	public SwaggerSpringMvcPlugin v1APIConfiguration() {
		SwaggerSpringMvcPlugin swaggerSpringMvcPlugin = new SwaggerSpringMvcPlugin(this.springSwaggerConfig);		
		swaggerSpringMvcPlugin
					.apiInfo(getApiInfo()).apiVersion("1.0")
					.includePatterns("/v1/*.*").swaggerGroup("v1");		
		swaggerSpringMvcPlugin.useDefaultResponseMessages(false);		
	    return swaggerSpringMvcPlugin;
	}
	
	 @Bean
	 public SwaggerSpringMvcPlugin v2APIConfiguration(){
		 	SwaggerSpringMvcPlugin swaggerSpringMvcPlugin = new SwaggerSpringMvcPlugin(this.springSwaggerConfig);
			swaggerSpringMvcPlugin
			.apiInfo(getApiInfo()).apiVersion("2.0")
			.includePatterns("/v2/*.*").swaggerGroup("v2");
			swaggerSpringMvcPlugin.useDefaultResponseMessages(false);			
		    return swaggerSpringMvcPlugin;
	 }
}
