package com.example.ec2test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class TestController {

    private static final UUID randomUUID = UUID.randomUUID();
    @GetMapping("/api/test")
    public ResponseEntity<UUID> test() {
        return ResponseEntity.ok(randomUUID);
    }
}
