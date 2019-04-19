package com.kys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration  
@Controller  
public class IndexConfig extends WebMvcConfigurerAdapter {  
  
    @Override  
    public void addViewControllers(ViewControllerRegistry registry) {  
        registry.addViewController("/").setViewName("forward:/index.jsp");  
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);  
        super.addViewControllers(registry);  
    }  
 
}  
