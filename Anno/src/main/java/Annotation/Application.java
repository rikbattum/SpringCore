package Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {

	@Bean
	public Auto auto () {
		Auto auto = new Auto () ; 
		auto.setWheel(wheel());
		return auto;
	}
	@Bean
	public Fiets fiets () {
		auto();
		auto();
		return new Fiets();
		
	}
	
	@Bean
	public Wheel wheel () {
	return new Wheel (); 	

	};

}
