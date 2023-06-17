package com.jan1ooo.systemrh;

import com.jan1ooo.systemrh.model.Vaga;
import com.jan1ooo.systemrh.repository.VagaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SystemRhSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemRhSpringBootApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(VagaRepository vagaRepository){
		return args -> {
			vagaRepository.deleteAll();
			Vaga v1 = new Vaga();
			v1.setTitle("Developer");
			v1.setDescription("Developer Senior Java");
			v1.setSalary(19000.0);
			v1.setDate("20/01/2023");
			vagaRepository.save(v1);
		};
	}

}
