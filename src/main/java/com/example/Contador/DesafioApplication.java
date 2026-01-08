package com.example.Contador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Contador.service.MenuPrincipal;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {
	private final MenuPrincipal menu;

	public DesafioApplication(MenuPrincipal menu) {
		this.menu = menu;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		menu.mostrarMenu();
	}
}
