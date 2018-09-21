package com.rock.labs.cats;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatMetricsController {

    @RequestMapping(value="/")
    public String home() {
        return "home";
    }
}
