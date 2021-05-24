package org.sid.GestionProduitBackEnd.web;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.ResponseEntity.status;

import java.util.List;

import org.sid.GestionProduitBackEnd.dao.ProductRepository;
import org.sid.GestionProduitBackEnd.dto.ProductDto;
import org.sid.GestionProduitBackEnd.entities.Product;
import org.sid.GestionProduitBackEnd.service.ProdService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class ProductRestController {

	private ProdService prodService;
	
	
	public ProductRestController(ProdService prodService )
	{
		this.prodService=prodService;
	}
	
	@PostMapping(path="/addProduct")
	public ResponseEntity<Void> createProduct(@RequestBody ProductDto productDto) {
		prodService.save(productDto);
        return new ResponseEntity<>(CREATED);
    }
	
	@GetMapping()
	public ResponseEntity<List<ProductDto>> getAllProduct()
	{
		return status(HttpStatus.OK).body(prodService.getAllProducts());
				
	}
}
