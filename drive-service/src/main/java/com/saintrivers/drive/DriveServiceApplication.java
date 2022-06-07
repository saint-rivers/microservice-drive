package com.saintrivers.drive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableFeignClients
@RestController
public class DriveServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DriveServiceApplication.class, args);
    }

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("status", "OK");
        map.put("payload", "hello");
        return ResponseEntity.ok(map);
    }

}
