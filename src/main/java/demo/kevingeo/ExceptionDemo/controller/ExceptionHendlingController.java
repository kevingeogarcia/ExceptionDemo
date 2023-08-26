package demo.kevingeo.ExceptionDemo.controller;

import demo.kevingeo.ExceptionDemo.custom.exceptions.BussinesException;
import demo.kevingeo.ExceptionDemo.custom.exceptions.CustomException;
import demo.kevingeo.ExceptionDemo.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHendlingController {


    @ExceptionHandler(value = {BussinesException.class})
    public ResponseEntity<Response> demoCustomException(BussinesException ex) {
        return new ResponseEntity<Response>(new Response("99", "Mensaje personalizado!", ex.getMessage()), HttpStatus.OK);
    }

    @ExceptionHandler(value = {CustomException.class})
    public ResponseEntity<Response> demoCustomException(CustomException ex) {
        return new ResponseEntity<Response>(new Response("99", "Mensaje personalizado!", ex.getMessage()), HttpStatus.OK);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Response> demoCustomException(Exception ex) {
        return new ResponseEntity<Response>(new Response("99", "Mensaje personalizado!", ex.getMessage()), HttpStatus.OK);
    }
}
