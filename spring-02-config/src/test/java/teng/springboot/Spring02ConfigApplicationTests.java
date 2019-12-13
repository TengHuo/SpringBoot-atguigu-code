package teng.springboot;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import teng.springboot.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
class Spring02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        boolean test = ioc.containsBean("helloService2");
        System.out.println(test);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
