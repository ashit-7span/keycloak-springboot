package com.keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RolesAllowed("user")
    @GetMapping("/user")
    public String user() {
        return "hello user";
    }

    @RolesAllowed("admin")
    @GetMapping("/admin")
    public String admin() {
        return "hello admin";
    }

}
