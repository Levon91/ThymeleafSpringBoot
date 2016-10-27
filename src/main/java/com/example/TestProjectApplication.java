package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

//@EnableWebMvc
@EntityScan("com.example.model")
@SpringBootApplication
public class TestProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestProjectApplication.class, args);
    }
//
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/css/**")
//                .addResourceLocations("classpath:/static/css/");
//    }

//    @Bean()
//    public ServletContextTemplateResolver templateResolver() {
//        final ServletContextTemplateResolver resolver =
//                new ServletContextTemplateResolver();
////        resolver.setPrefix("/WEB-INF/templates/");
////        resolver.setSuffix(".html");
//        resolver.setTemplateMode("HTML5");
//        resolver.setCacheable(false);
//        resolver.setCharacterEncoding("UTF-8");
//        return resolver;
//    }
}
