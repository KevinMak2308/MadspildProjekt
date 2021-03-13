package group3.dk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
private Member member;

public AccountController() {
    this.member = new Member("se", "adfghj", "adfghj", "adfghj", "adfghj", "adfghj");
}


    @GetMapping("/homepage")
    public String frontPage() {
        return "frontpage.html";
    }

    @GetMapping("/account")
    public String userLogin(Model model) {
        model.addAttribute("user", member);
    return "account.html";

    }

    @GetMapping("/register")
    public String register() {
        return "register.html";
    }

    @PostMapping("/doRegister")
    public String doRegister(@ModelAttribute Member model) {
    this.member = model;
    return "redirect:/account";
    }

}
