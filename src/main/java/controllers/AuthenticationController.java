package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenticationController {
    @GetMapping("/sign-up")
    public String getSignUpPage() {
        return "sign-up";
    }
    @PostMapping("/sign-up")
    public void signUp(@RequestParam String name, @RequestParam String password) {

    }
}