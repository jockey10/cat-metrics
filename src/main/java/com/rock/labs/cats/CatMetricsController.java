package com.rock.labs.cats;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CatMetricsController {

    @RequestMapping("/")
    public String index() {
        return "Meow!";
    }

}
