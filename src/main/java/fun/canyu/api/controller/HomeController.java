package fun.canyu.api.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PreAuthorize("hasRole('ROLE_NORMAL_USER')")
    @GetMapping("/secure")
    public String secure(){
        return "secure";
    }
}
