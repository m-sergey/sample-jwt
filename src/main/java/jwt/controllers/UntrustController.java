package jwt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UntrustController {

    @RequestMapping("/untrust")
    public String echo() {
        return "public";
    }
}
