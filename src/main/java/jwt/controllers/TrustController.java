package jwt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrustController {

    @RequestMapping("/trust")
    public String echo() {
        return "private";
    }

}
