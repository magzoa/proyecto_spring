package py.edu.facitec.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.facitec.model.Comentario;
import py.edu.facitec.repository.ComentarioRepository;



//Utilizando la arquitectura REST
@RestController
//Atiende requisiciones
@RequestMapping("/comentarios")
public class ComentarioController {
	
	
	//Inicializar
	@Autowired
	private ComentarioRepository comentarioRepository;
	
	
	@GetMapping
	public List<Comentario> getComentarios(){
		
		System.out.println("Listando elementos Java a Json");
		
		return comentarioRepository.findAll();
	}
	
	//comentarios/3
	@GetMapping(value="/{codigo}")
										//Cargar la url de arriba al codigo
	public Optional<Comentario> getComentario(@PathVariable Long codigo){
	
		System.out.println("Recuperando un elemento Java a Json");
		
		Optional<Comentario> retorno=comentarioRepository.findById(codigo);
		
		return retorno;
		
	}
	
					//    /{codigo}/
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminarComentario(@PathVariable Long codigo) {

		
		System.out.println("URL /comentarios/eliminar/3");
		
		comentarioRepository.deleteById(codigo);
		
	}
	
	@PostMapping			//Recibir Json que se convertira en Java
	public Comentario guardar(@RequestBody Comentario comentario){
		
		System.out.println("Json a Java");
		
         Comentario retorno=	 	comentarioRepository.save(comentario);
		
		return retorno;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
