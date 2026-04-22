package org.example.labo01;

import org.example.labo01.services.EspecimenService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Labo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Labo01Application.class, args);
	}

	@Bean
	public CommandLineRunner run(EspecimenService especimenService){
		return args -> {
			System.out.println("=== INICIANDO APP ===");
			especimenService.getAllEspecimen().forEach(e->
					System.out.println("[S.T.A.R.S-REPORT] Nombre: " + e.getNombre() +
							" | Nivel de Peligro: " + e.getNivelPeligro() +
							" | Punto Debil: " + e.getPuntoDebil())
			);
		};
	}
}
