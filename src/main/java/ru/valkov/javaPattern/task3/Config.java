package ru.valkov.javaPattern.task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public Map<String, String> map() {
        return new HashMap<>();
    }
}
