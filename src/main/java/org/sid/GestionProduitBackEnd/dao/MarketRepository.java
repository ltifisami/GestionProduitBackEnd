package org.sid.GestionProduitBackEnd.dao;


import java.util.Optional;

import org.sid.GestionProduitBackEnd.entities.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "market", path = "market")
public interface MarketRepository  extends JpaRepository<Market, Long>  {
Optional<Market> findByMarketName(String marketName);
}
