package se.magnus.microservices.core.product.model;

import lombok.Data;

@Data
public class Product {
  private Integer id;
  private String name;
  private String description;
  private String category;
  private Double price;
}
