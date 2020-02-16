package com.example.client_book.driver.service;

import com.example.client_book.driver.model.Inscription;
import com.example.client_book.driver.repository.InscriptionRepository;
import com.example.client_book.driver.util.ApiError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class InscriptionService {

    @Autowired
    InscriptionRepository inscriptionRepository;

    public Inscription saveInscription(String message){
        try {
            Inscription inscription = new Inscription();
            double randomNumber = Math.random();
            inscription.setMessage(message + " " + randomNumber);
            inscription.setCreationDate(new Date());
            inscriptionRepository.save(inscription);
            return inscription;
        }
        catch (Exception e) {
            throw new ApiError("saveInscription fail", e);
        }
    }
}
