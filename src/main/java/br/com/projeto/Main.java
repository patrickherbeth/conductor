package br.com.projeto;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.projeto.model.Document;
import br.com.projeto.repository.DocumentRepository;

@SpringBootApplication
public class Main implements CommandLineRunner {

  @Autowired
  private DocumentRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    repository.deleteAll();
	
    // save
    Document document = new Document("001");
    document.setName("Aryelle");
    document.setIdentification(001);
    document.setState("Paraiba");
    document.setValue(001);
    document.setLOW("CS001");
    
    Document document1 = new Document("002");
    document1.setName("Patrick");
    document1.setIdentification(002);
    document1.setState("Paraiba");
    document1.setValue(001);
    document1.setLOW("CS002");
    
    repository.save(document);
    repository.save(document1);
  
    

    // fetch all 
    System.out.println("Documentos encontrados findAll():");
    System.out.println("-------------------------------");
    for (Document customer : repository.findAll()) {
      System.out.println(customer);
    }
    System.out.println();

    // fetch an individual customer
    System.out.println("Document encontrado pelo Id findByFirstId('001'):");
    System.out.println("--------------------------------");
    System.out.println(repository.findById("001"));


  }

}