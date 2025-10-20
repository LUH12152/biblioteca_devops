package com.example.biblioteca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BienvenidoControler {
        @GetMapping
        public String bienvenido(){
            String release = "Bienvenido a la version oficial";
            return "Bienvenido momnte naranco de nuevo";
        }



}
