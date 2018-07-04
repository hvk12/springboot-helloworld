package com.hvk.experiments.springboothelloworld.controllers

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    public static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping(value="/hello/{name}", method=RequestMethod.GET)
    public  ResponseEntity<?> hellothere(@PathVariable("name") String name){
        def result = name?"Hello ${name} !!!!":"Hello World!!!"
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
}
