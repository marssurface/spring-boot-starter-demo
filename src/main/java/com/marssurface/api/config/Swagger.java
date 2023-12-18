package com.marssurface.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger {


    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring boot starter demo")
                        .version("1.0")
                        .description( "Spring boot starter demo示例")
                        .termsOfService("")
                        .license(new License().name("Apache 2.0").url("")));
    }

//    @Bean
//    public GroupedOpenApi t1Api(){
//        return GroupedOpenApi.builder().group("t1").pathsToMatch("/t1/**").packagesToScan("com.marssurface.api.controller.t1").build();
//    }
//
//    @Bean
//    public GroupedOpenApi t2Api(){
//        return GroupedOpenApi.builder().group("t2").pathsToMatch("/t2/**").packagesToScan("com.marssurface.api.controller.t2").build();
//    }
}
