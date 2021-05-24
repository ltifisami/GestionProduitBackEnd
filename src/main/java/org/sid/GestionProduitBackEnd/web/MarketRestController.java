package org.sid.GestionProduitBackEnd.web;

import static org.springframework.http.HttpStatus.CREATED;

import org.sid.GestionProduitBackEnd.dto.MarketDto;
import org.sid.GestionProduitBackEnd.service.MarketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/market")
public class MarketRestController {

	private MarketService marketService;
	
	public MarketRestController(MarketService marketService)
	{
		this.marketService=marketService;
	}
	
	@RequestMapping(path="addMarket")
	public ResponseEntity<Void> createComment(@RequestBody MarketDto marketDto) {
		marketService.save(marketDto);
        return new ResponseEntity<>(CREATED);
    }
	
}
