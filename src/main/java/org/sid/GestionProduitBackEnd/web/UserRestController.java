package org.sid.GestionProduitBackEnd.web;

import javax.validation.Valid;

import org.sid.GestionProduitBackEnd.dao.UserRepository;
import org.sid.GestionProduitBackEnd.entities.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserRestController {

	private UserRepository userRepository;
	
	public UserRestController(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}
	
	@RequestMapping(path="addUser")
	public User addUser(@Valid @RequestBody User user)
	{
		return userRepository.save(user);
	}
}
