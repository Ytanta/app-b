package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotifyController {


    private static final Logger log = LoggerFactory.getLogger(NotifyController.class);

    @PostMapping
    public ResponseEntity<String> notify(@RequestBody UserDto user) {
        log.info("Received user: {}", user);
        log.info("Responding with OK");
        return ResponseEntity.ok("OK");
    }
}