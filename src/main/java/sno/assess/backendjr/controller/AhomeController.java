package sno.assess.backendjr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backendjr.assess.sno")
public class AhomeController {

    @RequestMapping
    public String index() {
        return "Specno Reddit Clone:\n\nOptions:\n/user - /post - /comment";
    }

}

