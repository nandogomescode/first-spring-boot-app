package com.veras.first_spring_app.controller;

import com.veras.first_spring_app.domain.User;
import com.veras.first_spring_app.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world") //O parametro informa qual request deve-se mapear
public class HelloWorldController {

    //post, get, delete, put, patch, options, head

    //Dependencia
    @Autowired
    private HelloWorldService helloWorldService;

    //Get /hello-world
    @GetMapping
    public String helloWorld() {

        return this.helloWorldService.helloWorld("Fernando Veras");

    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value="filter", defaultValue = "nenhum") String filter ,@RequestBody User body) {
        return "Hello World " + body.getName() + " " + id;
    }

    @PostMapping
    public String teste(@RequestBody User body) {
        return "Hello World Post" + body;
    }
}
