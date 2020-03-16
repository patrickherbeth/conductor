package br.com.projeto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.projeto.model.Document;

public interface DocumentRepository extends MongoRepository<Document, String> {

}