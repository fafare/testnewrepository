package Appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.Acar;
import model.AcarEngine;
import model.Engine;

@Configuration
public class Config {

	@Bean
	public Acar toyota(Engine engine) {
		return new Acar(engine);
	}
	
	@Bean
	public AcarEngine toyotaEngine() {
		return new AcarEngine();
	}

}
