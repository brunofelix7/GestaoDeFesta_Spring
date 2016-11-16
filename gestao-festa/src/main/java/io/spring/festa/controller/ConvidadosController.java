package io.spring.festa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import io.spring.festa.model.Convidado;
import io.spring.festa.repository.Convidados;

@Controller
//@RequestMapping("/convidados") - Evita a repetição constante nos métodos
public class ConvidadosController {

	/*
	 * Permite injetar o repositório(objeto) no controller
	 */
	@Autowired
	private Convidados convidados;
	
	/*
	 * Define a URL que será usada para fazer a chamada desse método
	 * No browser, a chamada desse método ficará http://localhost:8080/convidados
	 */
	@RequestMapping("/convidados")
	public ModelAndView listar(){
		ModelAndView mv = new ModelAndView("ListaConvidados");	//Recebe o nome da view e com o método addObject(),
		mv.addObject("convidados", convidados.todos());			//podemos adicionar objetos para a view
		mv.addObject(new Convidado());							//É o objeto que iremos setar os valores do formulário 
		return mv;
	}
	
	/*
	 * Vai receber uma requisição POST de /convidados
	 * O método HTTP default que @RequestMapping define é o GET
	 */
	@RequestMapping(value = "/convidados", method = RequestMethod.POST)
	public String salvar(Convidado convidado){
		this.convidados.adicionar(convidado);
		return "redirect:/convidados";	// Faz com que o browser faça uma nova requisição GET para /convidados, atualizando a tabela (refresh)
	}

}
