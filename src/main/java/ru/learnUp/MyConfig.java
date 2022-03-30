package ru.learnUp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@EnableAspectJAutoProxy
@Configuration
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Player playerBean() {
        return new Player();
    }

    @Bean
    @Scope("singleton")
    public Game gameBean() {
        return new Game();
    }

}
