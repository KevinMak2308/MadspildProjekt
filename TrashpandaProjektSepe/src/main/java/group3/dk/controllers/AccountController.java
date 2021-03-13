package group3.dk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
    private Member member;
    private Post post;

    public AccountController() {
        this.member = new Member("johndoe@mail.dk", "123456", "Jonh Doe", "152694-2646", "gadevej 124", "5020 6275");
        this.post = new Post(12.95, 123.34);
    }


    @GetMapping("/homepage")
    public String homepage() {
        return "homepage.html";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/account")
    public String userLogin(Model model) {
        model.addAttribute("user", member);
        return "account";
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

    @GetMapping("/overview")
    public String overview(Model model){
        model.addAttribute("ad1", post);
        return "overview";
    }

    @GetMapping("/advertisement")
    public String advertisment() {
        return "advertisement";
    }

    @PostMapping("/createAd")
    public String createAd(@ModelAttribute Post model) {
        this.post = model;
        return "redirect:/overview";
    }
}