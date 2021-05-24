package org.sid.GestionProduitBackEnd.service;

import org.sid.GestionProduitBackEnd.dao.MarketRepository;
import org.sid.GestionProduitBackEnd.dto.MarketDto;
import org.sid.GestionProduitBackEnd.entities.Market;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MarketService {

	private MarketRepository marketRepository;
	
	public void save(MarketDto marketDto)
	{
		Market market = new Market();
		market.setMarketName(marketDto.getMarketName());
		market.setMarketLocation(marketDto.getMarketLocation());
		marketRepository.save(market);
	}
	
	
}
