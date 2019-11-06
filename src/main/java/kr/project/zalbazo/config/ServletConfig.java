package kr.project.zalbazo.config;

import kr.project.zalbazo.interceptor.SampleInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "kr.project.zalbazo.controller")
public class ServletConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SampleInterceptor()).addPathPatterns("/loginProcess");
    }
}
