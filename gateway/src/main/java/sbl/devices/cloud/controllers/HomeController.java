package sbl.devices.cloud.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {
    @Value("${name}")
    private String name = "World";

    @RequestMapping("/hello")
    public String hello() {
        return String.format("Hello, %s!", name);
    }
}
