package com.example.helloapi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value= "/hello", method= RequestMethod.GET )
    public String HelloApi(){
        return "Hello, My name is Inesh Reddy.";
    }

    @RequestMapping(value= "/hello/{id}", method= RequestMethod.GET)
    public String HelloWithDynamicVariableApi(@PathVariable("id") String id){
        return String.format("Hello, My name is %s!", id);
    }
}
