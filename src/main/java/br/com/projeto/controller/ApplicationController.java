package br.com.projeto.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;

import br.com.projeto.model.Document;
import br.com.projeto.service.ApplicationService;

/**
 * CRUD Controller for the model: Document.
 *
 * @author Patrick
 */
@RestController
@RequestMapping(path = "/api/documents")
@Api(value = "document", tags = "document-controller")
public class ApplicationController {

	/**
	 */
	@Autowired
	private ApplicationService service;

	/**
	 * @param document
	 * @return
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/save")
	@ApiOperation(value = "salva dociumento", notes = "Salva um documento")
  	public String save(@RequestBody Document document) {
		
		service.save(document);

		return "Save Document with Sucess";
	}

	/**
	 * @param document
	 * @return
	 */
	@ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/list")
	@ApiOperation(value = "lista de todos documentos", notes = "Retorna lista de documentos")
	public List<Document> list() {
		
		List<Document> optinal = service.list();
		return optinal;
	}

	/**
	 * @param document
	 * @return 
	 * @return
	 */
	@ResponseStatus(HttpStatus.OK)
	@PostMapping("/filter/{documentId}")
	@ApiOperation(value = "filtrar pelo Id", notes = "Retorna documento pelo Id")
	public String filterById(@PathVariable(value = "documentId") String documentId) {
		Optional<Document> optinal = service.filterById(documentId);
		return optinal.get().toString();
	}
	
	/**
	 * @param document
	 * @return
	 */
	@ResponseStatus(HttpStatus.OK)
	@PostMapping({ "/test", "" })
    @ApiOperation(value = "Create an User", notes = "Testa o end point")
	public String teste() {
		
		return "Teste de Rotas";
	}
}
