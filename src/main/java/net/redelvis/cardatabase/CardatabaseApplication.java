package net.redelvis.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;

@SpringBootApplication
//@ImportResource("classpath:uccx-properties.xml")
public class CardatabaseApplication {
    private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

    public static void main(String[] args) {
        var ctx = SpringApplication.run(CardatabaseApplication.class, args);
        logger.info("Hello Spring Boot");

//        System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
//        var names = ctx.getBeanDefinitionNames();
//        Arrays.sort(names);
 //       Arrays.asList(names).forEach(System.out::println);
    }

}
