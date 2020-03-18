package com.example.client_book.driver.web;

import com.example.client_book.driver.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartPageController {

    @Autowired
    InscriptionRepository inscriptionRepository;

    @GetMapping("/startpage")
    private String index(Model model) {
        model.addAttribute("inscriptionList", inscriptionRepository.findAll());
        return "index";
    }
}
