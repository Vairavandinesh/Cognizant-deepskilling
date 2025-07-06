package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(CountryRepository repo) {
        return args -> {
            repo.save(new Country() {{ setCode("IN"); setName("India"); }});
            repo.save(new Country() {{ setCode("US"); setName("United States"); }});
        };
    }
}