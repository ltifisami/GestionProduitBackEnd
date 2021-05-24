package org.sid.GestionProduitBackEnd.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	    @Column( nullable = false, unique = true)
	    private String email;

	    @Column(nullable = false)
	    private String firstName;

	    @Column( nullable = false)
	    private String lastName;

	    @Column( nullable = false, unique = true)
	    private String username;
	    
	    @Column( nullable = false)
	    private String password;
	    
	    @NotNull
	    @Enumerated(EnumType.STRING)
	    private Role roleName;

	    private Instant created;
	    private boolean enabled;
	    
	    @OneToMany(mappedBy="user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		private List<Product> products;
	    
	    @OneToMany(mappedBy="user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		private List<Announcement> announcements;
		
		
}
