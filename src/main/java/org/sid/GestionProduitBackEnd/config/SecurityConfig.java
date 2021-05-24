package org.sid.GestionProduitBackEnd.config;

import org.sid.GestionProduitBackEnd.security.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



import lombok.AllArgsConstructor;

@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	    private final UserDetailsService userDetailsService;
	    private final JwtAuthenticationFilter jwtAuthenticationFilter;

	    @Bean(BeanIds.AUTHENTICATION_MANAGER)
	    @Override
	    public AuthenticationManager authenticationManagerBean() throws Exception {
	        return super.authenticationManagerBean();
	    }
	    @Bean
	    PasswordEncoder passwordEncoder()
	    {
	    	return new BCryptPasswordEncoder();
	    }
	@Override
    public void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.cors().and()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/auth/**")
                .permitAll()
                .antMatchers("/auth/login").permitAll()
                .antMatchers(HttpMethod.GET, "/user")
                .permitAll()
                .antMatchers(HttpMethod.GET, "/market")
                .permitAll()
                .antMatchers(HttpMethod.GET, "/announcement")
                .permitAll()
                .antMatchers(HttpMethod.GET, "/product")
                .permitAll()
                .antMatchers("/v2/api-docs",
                        "/configuration/ui",
                        "/swagger-resources/**",
                        "/configuration/security",
                        "/swagger-ui.html",
                        "/webjars/**")
                .permitAll()
                .anyRequest()
                .authenticated();
        httpSecurity.addFilterBefore(jwtAuthenticationFilter,
                UsernamePasswordAuthenticationFilter.class);
    }
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception 
	{
		authenticationManagerBuilder.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder());
	}

}
