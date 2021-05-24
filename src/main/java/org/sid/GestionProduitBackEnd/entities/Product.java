package org.sid.GestionProduitBackEnd.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false,unique=true)
	private String name;
	@Column(nullable = false,unique=true)
	private String code;
	@Column(nullable = false)
	private double price;
	@Column
	private Instant validityDate;
	
	@Column(nullable = false)
	private Category category;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "market_id", nullable = false)
	private Market market;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	
}
