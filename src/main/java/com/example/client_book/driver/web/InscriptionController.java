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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/inscription")
public class InscriptionController {

    @Autowired
    ResponseService responseService;

    @Autowired
    InscriptionService inscriptionService;

    @PostMapping("/addinscription")
    private ResponseEntity addInscription() {
        ResponseEntity responseEntity = responseService.returnResponseEntity("Message from Frontend");
        return responseEntity;
    }

    @GetMapping("/showall")
    private ResponseEntity<List<Inscription>> showAllInscriptions() {
        List<Inscription> inscriptionList = inscriptionService.returnAllInscriptions();
        ResponseEntity<List<Inscription>> responseEntity = ResponseEntity.status(HttpStatus.OK).body(inscriptionList);
        return responseEntity;
    }
}
