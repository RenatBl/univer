package ru.itis.univer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.univer.services.UsersService;

@Controller
public class ConfirmController {

    private final UsersService usersService;

    public ConfirmController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/confirm")
    public String confirmUser(@RequestParam("link") String link) {
        usersService.confirmUser(link);
        return "redirect:/signIn";
    }
}
