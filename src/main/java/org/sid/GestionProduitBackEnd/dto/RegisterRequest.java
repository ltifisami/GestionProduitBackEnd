package org.sid.GestionProduitBackEnd.dto;
import org.sid.GestionProduitBackEnd.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
	
	
	private String firstName;
    private String lastName;
	private String email;
	private String username;
	private String password; 
	private Role roleName;
	    
}
