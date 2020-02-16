package com.example.client_book.driver.repository;

import com.example.client_book.driver.model.Inscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends CrudRepository<Inscription, Long> {
}
