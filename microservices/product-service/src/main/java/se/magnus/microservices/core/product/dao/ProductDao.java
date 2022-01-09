package se.magnus.microservices.core.product.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;
import se.magnus.microservices.core.product.exception.BadRequestException;
import se.magnus.microservices.core.product.model.Product;

@Component
public class ProductDao {
  private Map<Integer, Product> productMap = new HashMap<>();

  public void addProduct(Product product){
    product.setId(productMap.size()+1);
    productMap.put(product.getId(), product);
  }

  public void updateProduct(Product product){
    if(productMap.containsKey(product.getId())) {
      productMap.put(product.getId(), product);
    }else{
      throw new BadRequestException("Product does not exist");
    }
  }

  public Product getProduct(Integer id){
    if(id==null || !productMap.containsKey(id)){
      throw new BadRequestException("Product does not exist");
    }else{
      return productMap.get(id);
    }
  }
}
