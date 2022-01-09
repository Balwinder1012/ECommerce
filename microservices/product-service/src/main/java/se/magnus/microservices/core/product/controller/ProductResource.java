package se.magnus.microservices.core.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {

  @GetMapping("all")
  public String getAllProducts(){
    return "all products";
  }
}
