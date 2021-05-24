package org.sid.GestionProduitBackEnd.web;

import org.sid.GestionProduitBackEnd.dto.AuthenticationResponse;
import org.sid.GestionProduitBackEnd.dto.LoginRequest;
import org.sid.GestionProduitBackEnd.dto.RegisterRequest;
import org.sid.GestionProduitBackEnd.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;

@CrossOrigin("*")
@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthController {
	
	private final AuthService authService;
	
	@PostMapping("/signup")
	public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {
		authService.signup(registerRequest);
		return new ResponseEntity<>("User Registration Successful",HttpStatus.OK);
	}
	
	@GetMapping("accountVerification/{token}")
	public ResponseEntity<String> verifyAccount(@PathVariable String token)
	{
		authService.verifyAccount(token);
		return new ResponseEntity<>("Account Activated Successfully",HttpStatus.OK);
	}
	 
	
	@PostMapping(value="/login" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) throws Exception
	{
		return authService.login(loginRequest);
	}
	

}
