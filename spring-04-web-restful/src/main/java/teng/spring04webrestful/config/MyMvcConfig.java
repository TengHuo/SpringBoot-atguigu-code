package teng.spring04webrestful.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.FormContentFilter;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import teng.spring04webrestful.component.LoginHanderInterceptor;
import teng.spring04webrestful.component.MyLocaleResolver;

//@EnableWebMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("atguigu").setViewName("success");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("main.html").setViewName("dashboard");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 测试错误处理，注释掉代码
//        registry.addInterceptor(new LoginHanderInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/index.html", "/", "/user/login", "/asserts/**", "/webjars/**");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

//    @Bean
//    public FormContentFilter formContentFilter() {
//        return new FormContentFilter();
//    }
}
