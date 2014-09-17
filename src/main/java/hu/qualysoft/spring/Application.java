package hu.qualysoft.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author zsolt
 */
@ComponentScan
@Configuration
@EnableJpaRepositories("hu.qualysoft.spring.repository")
@EnableAutoConfiguration
@ImportResource("classpath:spring.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
