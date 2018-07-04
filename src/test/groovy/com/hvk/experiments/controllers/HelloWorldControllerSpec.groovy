package com.hvk.experiments.controllers

import com.hvk.experiments.springboothelloworld.controllers.HelloWorldController

import org.springframework.test.web.servlet.MockMvc
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.http.HttpStatus.*
import spock.lang.Specification

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloWorldControllerSpec extends Specification {
    def helloWorldController  = new HelloWorldController()

    MockMvc mockMvc = standaloneSetup(helloWorldController).build()
    def "when helloworld controller hellothere is hit with param" (){

        when: " hellthere is hit with param"
        def response = mockMvc.perform(get('/hello/hvk/')).andReturn().response
        then:
        response.status == OK.value()
        response.getContentAsString() == 'Hello hvk !!!!'

    }
}
