package com.daksh.springprogram04.config;
import com.daksh.springprogram04.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
	@Bean
	public Chef chef() {
		Chef ch=new Chef();
		return ch;
	}
	@Bean
	public Restaurant res() {
		Restaurant res=new Restaurant();
		return res;
	}
}
