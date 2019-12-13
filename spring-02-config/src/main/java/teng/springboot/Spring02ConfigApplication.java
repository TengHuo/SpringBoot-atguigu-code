package teng.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class Spring02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring02ConfigApplication.class, args);
    }

}
