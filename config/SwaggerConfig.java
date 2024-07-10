package com.swagger.config;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springdoc-public")
                .pathsToMatch("/**")
                .build();
    }
    @Bean
    public GroupedOpenApi booksApi() {
        return GroupedOpenApi.builder()
                .group("books-api")
                .pathsToMatch("/books/")  // Match all paths under /books
                .build();
    }
}
