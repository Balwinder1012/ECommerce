package se.magnus.microservices.core.product.exception;

public class BadRequestException extends RuntimeException {
  public BadRequestException(String message){
    super(message);
  }

}
