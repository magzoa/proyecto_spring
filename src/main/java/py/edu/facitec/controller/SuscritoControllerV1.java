package py.edu.facitec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import py.edu.facitec.model.Suscrito;
import py.edu.facitec.repository.SuscritoRepository;

@Controller
public class SuscritoControllerV1 {
	
	//Inicializa y carga dentro del contexto de spring
	@Autowired
	public SuscritoRepository suscritoRepository;
	
	
	
	@RequestMapping("/formulario")
public String acceder() {
	
	System.out.println("Accedio al formulario");
	
	return "suscrito/formulario";
}	
	@RequestMapping("/registrar")
										//request
	public String registrar(Suscrito suscrito) {
		
		System.out.println("Accedio a registrar");
		
		suscritoRepository.save(suscrito);
		
		//response
		//retornar la siguiente pagina
		return "suscrito/ok";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
