package com.strategy.picker.stock.configurations;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

/*
  *  https://www.baeldung.com/spring-rest-template-builder
  *  The above link explains the use of RestTemplateBuilder.
  *  For eg. One can create an interceptor and intercept the incoming request and
  *  and check whether it has any authorization token in the header if not
  *  we can send in a not authorized error
*/

/*
RestTemplateBuilder is provided by Spring Boot and we are injecting it into our classes
Spring boot takes care of autowiring it in the below case.
 */
    @Bean
    public RestTemplate getRestTemplateBean(RestTemplateBuilder builder){
        return builder.build();
        //return new RestTemplate();
    }
}
