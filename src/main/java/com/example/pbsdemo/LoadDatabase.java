package com.example.pbsdemo;

import com.example.pbsdemo.domain.Customer;
import com.example.pbsdemo.repo.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(CustomerRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Customer("pas", "active")));
            log.info("Preloading " + repository.save(new Customer("lucia", "active")));
            log.info("Preloading " + repository.save(new Customer("lucas", "inactive")));
            log.info("Preloading " + repository.save(new Customer("siena", "inactive")));
        };
    }
}
