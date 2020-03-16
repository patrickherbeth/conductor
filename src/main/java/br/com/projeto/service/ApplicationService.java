package br.com.projeto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;

import br.com.projeto.model.Document;
import br.com.projeto.repository.DocumentRepository;

@Service
public class ApplicationService implements InterfaceApplicationService {

	Logger l = Logger.getLogger( "org.mongodb.driver" );
   	
	@Autowired
	private DocumentRepository repository;

	/**
	 * Method for saving documents
	 */
	@Override
	public void save(Document document) {
		l.info("Salvando Docuemnto " + document.getId());		
		repository.save(document);
	}

	/**
	 * Method for listing documents
	 */
	@Override
	public List<Document> list() {
		
		for (Document document : repository.findAll()) {
			l.info("Arquivo encontrado: " + document.getId());	
			document.toString();
		}
		
		return repository.findAll();
	}

	/**
	 * Method to search by ID
	 */
	@Override
	public Optional<Document> filterById(String id) {

		// save
	    Document document = new Document(id);
	   	Example<Document> example = Example.of(document);
		
		this.print(example.getProbe());
		
		l.info("Arquivo encontrado ID: " + document.getId());	

		return repository.findOne(example);
	}

	/**
	 * Method for printing documents
	 * @param document
	 */
	public void print(Document document) {
		System.out.println(document);
	}
}
