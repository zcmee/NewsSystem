package com.github.zcmee.newssystem;

import com.github.zcmee.newssystem.classes.Skalka;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


//gdy załaduje sie cały kontekst beana(łacznie z tworzeniem tabel) to wtedy włacza sie metoda run
@SpringBootApplication
@EnableConfigurationProperties
public class NewssystemApplication implements CommandLineRunner {

	@Bean
	public Skalka skaleczka() {
		return new Skalka("Reczne fabrykowanie beanów223?????????");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NewssystemApplication.class, args);
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames) { System.out.println("Bean :: " + beanName); }
	}

	@Override
	public void run(String... strings) throws Exception {

	}
}
