package teng.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import teng.springboot.service.HelloService;

@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService2() {
        System.out.println("Import service.....");
        return new HelloService();
    }
}
