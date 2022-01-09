package se.magnus.microservices.core.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.magnus.microservices.core.product.dao.ProductDao;
import se.magnus.microservices.core.product.model.Product;

@RestController
public class ProductResource {
  /*
    create a product/ update a product
    get product
    search product by name by id by category
   */
  private final ProductDao productDao;

  @Autowired
  public ProductResource(ProductDao productDao) {
    this.productDao = productDao;
  }

  @PostMapping("product")
  public String getAllProducts(@RequestBody Product product){
    if(product.getId()==null){
      productDao.addProduct(product);
      return "Saved";
    }else{
      productDao.updateProduct(product);
      return "Updated";
    }
  }

  @GetMapping("product/{product-id}")
  public Product getProduct(@PathVariable("product-id") Integer prodId){
    return productDao.getProduct(prodId);
  }
}
