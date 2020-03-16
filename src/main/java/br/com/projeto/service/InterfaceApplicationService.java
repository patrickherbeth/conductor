package br.com.projeto.service;

import java.util.List;
import java.util.Optional;

import br.com.projeto.model.Document;


public interface InterfaceApplicationService {

	public void save(Document document);
	
	public List<Document> list();
	
    public Optional<Document> filterById(String id);
	
}
