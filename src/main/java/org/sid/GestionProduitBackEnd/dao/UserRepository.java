package org.sid.GestionProduitBackEnd.dao;
import java.util.Optional;

import org.sid.GestionProduitBackEnd.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByUsername(String username);

}
