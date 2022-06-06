package com.saintrivers.driveservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;

@SpringBootApplication
public class DriveServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriveServiceApplication.class, args);
    }

//     @Bean
//    public ConnectionFactoryInitializer initializer() {
//        var initializer = new ConnectionFactoryInitializer();
//        initializer.setConnectionFactory(connectionFactory());
//
//        var databasePopulator = new CompositeDatabasePopulator();
//        databasePopulator.addPopulators(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));
//        initializer.setDatabasePopulator(databasePopulator);
//        return initializer;
//    }

}
