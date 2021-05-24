package org.sid.GestionProduitBackEnd.service;


import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.sid.GestionProduitBackEnd.dao.MarketRepository;
import org.sid.GestionProduitBackEnd.dao.ProductRepository;
import org.sid.GestionProduitBackEnd.dto.ProductDto;
import org.sid.GestionProduitBackEnd.entities.Market;
import org.sid.GestionProduitBackEnd.entities.Product;
import org.sid.GestionProduitBackEnd.entities.User;
import org.sid.GestionProduitBackEnd.exception.*;
import org.springframework.stereotype.Service;



import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ProdService {

	private MarketRepository marketRepository;
	private final AuthService authService;
	private ProductRepository productRepository;

	public void save(ProductDto productDto) {
		
        Market market =  marketRepository.findByMarketName(productDto.getMarketProduct())
                .orElseThrow(() -> new SpringMarketException(productDto.getMarketProduct().toString()));
        User user= authService.getCurrentUser();
        
        Product prd= new Product();
        prd.setName(productDto.getName());
        prd.setCode(productDto.getCode());
        prd.setPrice(productDto.getPrice());
        prd.setValidityDate(Instant.now());
        prd.setUser(user);
        prd.setCategory(productDto.getCategoryProduct());
        prd.setMarket(market);
        
        productRepository.save(prd);

    }
	
	public List<ProductDto> getAllProducts()
	{
		List<ProductDto> prds = new ArrayList<ProductDto>() ;
		for( Product p : productRepository.findAll())
		{
			ProductDto p2= new ProductDto();
			p2.setId(p.getId());
			p2.setCategoryProduct(p.getCategory());
			p2.setCode(p.getCode());
			p2.setName(p.getName());
			p2.setMarketProduct(p.getMarket().getMarketName());
			p2.setPrice(p.getPrice());
			p2.setUserName(p.getUser().getUsername());
			p2.setValidityDate(p.getValidityDate());
			prds.add(p2);
			
		}
		return prds;
	}
}
