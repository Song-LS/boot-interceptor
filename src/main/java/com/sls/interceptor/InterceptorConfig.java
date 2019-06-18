package com.sls.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author sls
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    private ApiInterceptor apiInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用于排除拦截
        registry.addInterceptor(apiInterceptor).addPathPatterns("/**")
                // 放行swagger
                .excludePathPatterns("/swagger-resource/**", "/webjars/**", "/v2/**", "/swagger-ui.html")
                .excludePathPatterns("/")
                .excludePathPatterns("/login","/csrf");

    }
}
