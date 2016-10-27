package com.example.server.rs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by levont on 25/10/2016.
 */
@RestController
public class TestService {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "{\"code\" : 200}";
    }
}
