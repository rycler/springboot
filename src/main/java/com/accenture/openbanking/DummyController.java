package com.accenture.openbanking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mladen.d.dinev on 27/06/2017.
 */
@RestController
public class DummyController {
    private static final Logger LOG = LoggerFactory.getLogger(DummyController.class);

    @RequestMapping("/hello-world")
    public ResponseEntity<Greeting> sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        LOG.info("dsada");
        Greeting greeting = new Greeting(1, "sdasd");
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
