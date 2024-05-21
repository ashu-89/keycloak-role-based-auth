package com.himanshu.springkeycloakauth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @GetMapping("/hello")
  public ResponseEntity<String> hello() {
    return  new ResponseEntity<>("hello normal", HttpStatus.OK);
  }

  @GetMapping("/hello-pr")
  public ResponseEntity<String> helloProtected() {
    return  new ResponseEntity<>("hello vip", HttpStatus.OK);
  }
}
