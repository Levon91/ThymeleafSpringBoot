package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * Created by levont on 27/10/2016.
 */
@Configuration
public class ThymeleafConf {


//    @Bean
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.addTemplateResolver(templateResolver());
//        templateEngine.addTemplateResolver(urlTemplateResolver());
//        templateEngine.addDialect(new SpringSecurityDialect());
//        return templateEngine;
//    }
//
//    @Bean
//    public ViewResolver thymeleafViewResolver() {
//        ThymeleafViewResolver vr = new ThymeleafViewResolver();
//        vr.setTemplateEngine(templateEngine());
//        vr.setCharacterEncoding("UTF-8");
//        vr.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        // all message/* views will not be handled by this resolver;
//        vr.setExcludedViewNames(new String[]{"message/*"});
//        return vr;
//    }

}
