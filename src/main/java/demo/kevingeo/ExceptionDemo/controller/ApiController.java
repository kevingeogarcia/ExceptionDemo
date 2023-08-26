package demo.kevingeo.ExceptionDemo.controller;

import demo.kevingeo.ExceptionDemo.custom.exceptions.BussinesException;
import demo.kevingeo.ExceptionDemo.custom.exceptions.CustomException;
import demo.kevingeo.ExceptionDemo.response.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {


    @GetMapping("/exception")
    public ResponseEntity<Response> exception() throws Exception {
        throw new Exception("Mensaje desde la clase generica de java: Exception!");
    }


    @GetMapping("/custom-exception")
    public ResponseEntity<Response> customException() throws CustomException {
        throw new CustomException("Mensaje personalizado desde la clase: CustomException!");
    }

    @GetMapping("/custom-bussines-exception")
    public ResponseEntity<Response> customBussinesException() throws CustomException {
        throw new BussinesException("Mensaje personalizado desde la clase: BussinesException!");
    }
}
