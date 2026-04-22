package org.example.labo01;

import org.example.labo01.services.ActiveVirus;
import org.example.labo01.services.EspecimenService;
import org.example.labo01.services.FilterByEstatus;
import org.example.labo01.services.FilterByVirus;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class Labo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Labo01Application.class, args);
	}

	@Bean
	public CommandLineRunner run(EspecimenService especimenService, ActiveVirus activeVirus, FilterByVirus filterByVirus, FilterByEstatus filterByEstatus){
		return args -> {
			Scanner scanner = new Scanner(System.in);
			boolean continuar = true;

			System.out.println("=== INICIANDO APP ===");
			System.out.println("=== [S.T.A.R.S-REPORT] REPORTE INICIAL COMPLETO ===");
			especimenService.getAllEspecimen().forEach(e->
					System.out.println("[S.T.A.R.S-REPORT] Nombre: " + e.getNombre() +
							" | Nivel de Peligro: " + e.getNivelPeligro() +
							" | Punto Debil: " + e.getPuntoDebil())
			);
			while(continuar){
				System.out.println("\n-------------------------------------------");
				System.out.println("MENÚ");
				System.out.println("1. Filtrar por Virus Base");
				System.out.println("2. Filtrar por Estado");
				System.out.println("3. Ver Virus Activos (Sin repetición)");
				System.out.println("4. Salir");
				System.out.print("Seleccione una opción: ");

				String opcion = scanner.nextLine();

				switch (opcion) {
					case "1":
						System.out.print("Ingrese el nombre del Virus (T-virus, G-virus, Las Plagas o Cadou): ");
						String virus = scanner.nextLine();
						filterByVirus.filterbyvirus(virus).forEach(e->
								System.out.println("[S.T.A.R.S-REPORT] Nombre: " + e.getNombre() +
										" | Nivel de Peligro: " + e.getNivelPeligro() +
										" | Punto Debil: " + e.getPuntoDebil())
						);
						break;
					case "2":
						System.out.print("Ingrese el estado (Contenido, En libertad, Eliminado): ");
						String estado = scanner.nextLine();
						filterByEstatus.filterbyestatus(estado).forEach(e->
								System.out.println("[S.T.A.R.S-REPORT] Nombre: " + e.getNombre() +
										" | Nivel de Peligro: " + e.getNivelPeligro() +
										" | Punto Debil: " + e.getPuntoDebil())
						);
						break;
					case "3":
						System.out.println("Reporte de Virus con especímenes en libertad:");
						activeVirus.activevirus().forEach(e->
								System.out.println("[S.T.A.R.S-REPORT] Virus: " + e)
						);
						break;
					case "4":
						continuar = false;
						System.out.println("Cerrando menu...");
						break;
					default:
						System.out.println("Opción no válida.");
				}
			}
		};
	}
}
