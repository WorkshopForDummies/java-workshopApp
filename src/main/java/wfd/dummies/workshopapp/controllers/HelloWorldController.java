package wfd.dummies.workshopapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<String> getHelloWorld(String name){
        return new ResponseEntity<>("Hello "+ name, HttpStatus.ACCEPTED);
    }
}
