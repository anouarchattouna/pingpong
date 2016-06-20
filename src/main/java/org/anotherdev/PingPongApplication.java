package org.anotherdev;

import org.anotherdev.domain.PingPong;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PingPongApplication {

    @RequestMapping("/ping")
    public ResponseEntity<PingPong> ping() {
        return new ResponseEntity<PingPong>(new PingPong("pong", System.currentTimeMillis()), HttpStatus.OK);
    }

    public static void main(String[] args) {
        SpringApplication.run(PingPongApplication.class, args);
    }

}