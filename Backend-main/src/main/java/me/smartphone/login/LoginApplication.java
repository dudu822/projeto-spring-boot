package me.smartphone.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
		
		for (int a=0; a<8; a++) {
			System.out.println();
		}
		
		System.out.println("================= ATENÇÂO =================");
		System.out.println();
		System.out.println();
		System.out.println("SERVIDOR Smartphone iniciado :)");
		System.out.println();
		System.out.println();
		System.out.println("==================== # ====================");
		
	}

}
