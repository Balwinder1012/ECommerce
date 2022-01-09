package handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import se.magnus.microservices.core.product.exception.BadRequestException;

@ControllerAdvice
public class CustomExceptionHandler {

  @ExceptionHandler(value=BadRequestException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)  // 409

  public ResponseEntity<String> handleConflict(){
         // RuntimeException ex) {
    ResponseEntity<String> responseEntity = ResponseEntity.badRequest().body("erorr");
    return responseEntity;
  }
}
