package io.spring.festa.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import io.spring.festa.model.Convidado;

/*
 * Informa ao Spring que essa classe é um componente, e que é um repositório
 * Essa anotação permite injetar um Objeto do tipo Convidados no nosso controller
 */
@Repository	//
public class Convidados {
	
	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();

	static{
		LISTA_CONVIDADOS.add(new Convidado("Pedro Manuel", "Masculino", 27, 2));
		LISTA_CONVIDADOS.add(new Convidado("Maria de Fátima", "Feminino", 25, 3));
		LISTA_CONVIDADOS.add(new Convidado("Ricardo Albuquerque", "Masculino", 21, 1));
		LISTA_CONVIDADOS.add(new Convidado("Daniel Soares", "Masculino", 31, 2));
		LISTA_CONVIDADOS.add(new Convidado("Henrique Paes", "Masculino", 19, 2));
		LISTA_CONVIDADOS.add(new Convidado("Beatriz de Lima", "Feminino", 29, 2));
		LISTA_CONVIDADOS.add(new Convidado("Danielle Lima", "Masculino", 26, 2));
	}
	
	public List<Convidado> todos(){
		return Convidados.LISTA_CONVIDADOS;
	}
	
	public void adicionar(Convidado convidado){
		Convidados.LISTA_CONVIDADOS.add(convidado);
	}
	
}
