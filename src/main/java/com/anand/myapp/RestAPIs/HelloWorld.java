package com.anand.myapp.RestAPIs;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorld {
    
    @GetMapping(value = "/HelloWorld")
    public String HelloWorld(){
        return " Congratulations!, You have successfully launched the Application. [Version: 1.3]";
    }
}
