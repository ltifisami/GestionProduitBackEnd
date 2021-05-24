package org.sid.GestionProduitBackEnd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.sid.GestionProduitBackEnd.entities.Product;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	@RestResource
	public Product findByName(@Param("name")String name);
	
	@RestResource
	public Product findByCode(@Param("code")String code);
}
