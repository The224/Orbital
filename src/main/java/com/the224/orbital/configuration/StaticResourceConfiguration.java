package com.the224.orbital.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
public class StaticResourceConfiguration implements WebMvcConfigurer {

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // src/main/resources/public/...
        registry
                .addResourceHandler("/public/**")
                .addResourceLocations("classpath:/public/")
                .setCachePeriod( 3600 )
                .resourceChain(true)
                .addResolver(new PathResourceResolver());

        // File located on disk
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("file:////")
                .setCachePeriod( 3600 )
                .resourceChain(true);
    }
}