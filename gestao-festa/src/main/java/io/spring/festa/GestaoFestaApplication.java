package io.spring.festa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Diz que a classe faz parte da configuração do Spring
 */
@SpringBootApplication
public class GestaoFestaApplication {

	/*
	 * Acontece que o Spring Boot usa um Tomcat embarcado para facilitar o desenvolvimento, 
	 * então para iniciar nossa aplicação, basta executarmos o Método main da classe GestaoFestaApplication.
	 */
	public static void main(String[] args) {
		SpringApplication.run(GestaoFestaApplication.class, args);
	}
}
