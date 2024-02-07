package ru.gb.HomeWork5.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.gb.HomeWork5.aspects.LogAspect;

@Configuration
@ComponentScan(basePackages = "ru.gb.HomeWork5")
@EnableAspectJAutoProxy
public class TaskConfiguration {
    @Bean
    public LogAspect aspect(){return new LogAspect();}

}
