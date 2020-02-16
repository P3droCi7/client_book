package com.example.client_book.driver.service;

import com.example.client_book.driver.model.Inscription;
import com.example.client_book.driver.util.ApiJsonAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    @Autowired
    InscriptionService inscriptionService;

    public ResponseEntity returnResponseEntity(String message){

        ApiJsonAnswer apiJsonAnswer = new ApiJsonAnswer();
        Inscription inscription = inscriptionService.saveInscription(message);

        apiJsonAnswer.setId(inscription.getId());
        apiJsonAnswer.setName("Added");
        apiJsonAnswer.setDescription(inscription.getMessage());
        apiJsonAnswer.setStatus(HttpStatus.OK);

        if(inscription != null) {
            return ResponseEntity.status(HttpStatus.OK).body(apiJsonAnswer);
        } else {
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(apiJsonAnswer);
        }
    }
}
