package com.example.client_book.driver.web;

import com.example.client_book.driver.model.Inscription;
import com.example.client_book.driver.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Controller
@RequestMapping("/inscription")
public class InscriptionController {

    @Autowired
    InscriptionRepository inscriptionRepository;

    @PostMapping("/addinscription")
//    public String addBook(@ModelAttribute Inscription inscription, Model model) {
    public String addBook() {
        Inscription inscription1 = new Inscription();
        int randomNumber = (int) Math.random();
        inscription1.setMessage("test " + randomNumber);
        inscription1.setCreationDate(new Date());
        inscriptionRepository.save(inscription1);
//        return showAllBooks(model);
        return "Added + " + randomNumber;
    }

    @GetMapping("/showall")
//    private String showAllBooks(Model model) {
    private String showAllBooks() {
        inscriptionRepository.findAll();
//        return "showbooks";
        return  inscriptionRepository.findAll().toString();
    }
}
