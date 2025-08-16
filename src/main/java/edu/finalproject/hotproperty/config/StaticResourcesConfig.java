package edu.finalproject.hotproperty.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResourcesConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 將 URL /uploads/properties/** 對應到檔案系統 /var/app/uploads/properties/
        registry.addResourceHandler("/uploads/properties/**")
                .addResourceLocations("file:/var/app/uploads/properties/");
    }
}
