package io.beaniejoy.jenkinstestbuild;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello jenkins!");
    }

    @GetMapping("/hello2")
    public ResponseEntity<String> hello2() {
        return ResponseEntity.ok("hello another!");
    }
}
