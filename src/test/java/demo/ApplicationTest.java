package demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import br.com.projeto.model.Document;
import br.com.projeto.repository.DocumentRepository;
import junit.framework.Assert;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private DocumentRepository repository;
	
	@Autowired
	private Document service;
	
	@Test
	void testSave() {
		Document document = new Document("001");
	    document.setName("Aryelle");
	    document.setIdentification(001);
	    document.setState("Paraiba");
	    document.setValue(001);
	    document.setLOW("CS001");
	    
	    Document value = repository.save(document);
	    Assert.assertNotNull(value);
	}
	
	@Test
	void testList() {
			
		List<Document> value  = repository.findAll();
		 Assert.assertNotNull(value);
	}
	
	@Test
	void testFilterById() {
		
		Document document = new Document("001");
	    document.setName("Aryelle");
	    document.setIdentification(001);
	    document.setState("Paraiba");
	    document.setValue(001);
	    document.setLOW("CS001");
	   	
	    Example<Document> example = Example.of(document);
		Optional<Document> value  = repository.findOne(example);
		
		 Assert.assertNotNull(value);
			
	}
}
