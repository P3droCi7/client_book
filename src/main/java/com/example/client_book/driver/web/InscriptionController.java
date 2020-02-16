package com.example.client_book.driver.web;

import com.example.client_book.driver.model.Inscription;
import com.example.client_book.driver.repository.InscriptionRepository;
import com.example.client_book.driver.service.InscriptionService;
import com.example.client_book.driver.service.ResponseService;
import com.example.client_book.driver.util.ApiJsonAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/inscription")
public class InscriptionController {

    @Autowired
    ResponseService responseService;

    @PostMapping("/addinscription")
//    public String addBook(@ModelAttribute Inscription inscription, Model model) {
    public ResponseEntity addInscription() {
        ResponseEntity responseEntity = responseService.returnResponseEntity("Message from Frontend");
//        return showAllBooks(model);
        return responseEntity;
    }

//    @GetMapping("/showall")
////    private String showAllBooks(Model model) {
//    private String showAllBooks() {
//        inscriptionRepository.findAll();
////        return "showbooks";
//        return inscriptionRepository.findAll().toString();
//    }
}
