package com.universal.pos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    Mono<ResponseEntity<String>> greet(){
        return Mono.just(ResponseEntity.ok("Hello docker app!"));
    }
}
