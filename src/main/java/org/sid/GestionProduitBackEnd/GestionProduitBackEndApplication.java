package org.sid.GestionProduitBackEnd;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GestionProduitBackEndApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(GestionProduitBackEndApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	repositoryRestConfiguration.exposeIdsFor(ProductDto.class);
		
		repositoryRestConfiguration.exposeIdsFor(Category.class);
		repositoryRestConfiguration.exposeIdsFor(Market.class);
		repositoryRestConfiguration.exposeIdsFor(User.class);
		Market market= new Market();
		market.setMarketLocation("Kasserine");
		market.setMarketName("Electronique");
		marketRepository.save(market);
		Category categoryy= new Category();
		categoryy.setName("Electronique");
		categoryRepository.save(categoryy);
		User user= new User();
		user.setEmail("sami@market.tn");
		user.setFirstName("sami");
		user.setLastName("ltifi");
		user.setPassword("1234");
		user.setUsername("sami.ltifi");
		user.setRoleName(Role.ADMIN);
		userRepository.save(user);
		Random rnd = new Random();
		Date today = new Date(); 
		Date validityDate = new Date();
		
		for(int i=0; i<10;i++)
		{
			Calendar c = Calendar.getInstance();
			c.setTime(today);
			c.add(Calendar.DATE, 30);
			validityDate= c.getTime();
			ProductDto p = new ProductDto();
			p.setName(RandomString.make(10));
			p.setCode(RandomString.make(18));
			p.setPrice(100+rnd.nextInt(10000));
			p.setValidityDate(validityDate);
			p.setCategory(categoryy);
			p.setMarket(market);
			p.setUser(user);
			productRepository.save(p);
		}
		
		
		
		*/
	}

}