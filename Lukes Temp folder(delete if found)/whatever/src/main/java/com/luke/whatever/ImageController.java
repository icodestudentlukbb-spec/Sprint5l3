package com.luke.whatever;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
@RestController 
public class ImageController {
    @GetMapping("/image/{filename}")
    public ResponseEntity<Resource> serveImage(@PathVariable String filename) {
        Resource file = new ClassPathResource("statis/images/" + filename);
        return ResponseEntity.ok().body(file);
    }
}