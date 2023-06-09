package com.tryouts.restapi.config;

import com.tryouts.restapi.representation.PowerInputTypeProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    PowerInputTypeProcessor powerInputTypeProcessor() {
        return new PowerInputTypeProcessor();
    }

//    @Bean //FOR IN MEMORY FIRST TEST
//    CommandLineRunner initDatabase( DistrictRepository repository) {
//
//        return args -> {
//            LOG.info("Preloading " + repository.save(new District("TESTBezirk1")));
//            LOG.info("Preloading " + repository.save(new District("TestBezirk2")));
//        };
//    }
}
