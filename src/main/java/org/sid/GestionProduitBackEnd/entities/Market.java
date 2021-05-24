package org.sid.GestionProduitBackEnd.entities;

import java.io.Serializable;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Market implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false,unique=true)
	private String marketName;
	
	@Column(nullable = false,unique=true)
	private String marketLocation;
	
	@OneToMany(mappedBy="market", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Product> products;
	
	@OneToMany(mappedBy="market", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Announcement> announcements;

	
	
	
}
