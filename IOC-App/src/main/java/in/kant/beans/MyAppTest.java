package in.kant.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {
    public static void main(String[] args) {
        ApplicationContext ctxt=
                new ClassPathXmlApplicationContext("beans.xml");
        RestaurantService rt1 = ctxt.getBean(RestaurantService.class);
        rt1.processPayment(1200.00);
    }
}
