package org.sid.GestionProduitBackEnd.dto;

import java.time.Instant;
import java.util.Date;

import org.sid.GestionProduitBackEnd.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

	private Long id;
	private String name;
	private String code;
	private double price;
	private Instant validityDate;
	private String userName;
	private Category categoryProduct;
	private String marketProduct;
	
}
